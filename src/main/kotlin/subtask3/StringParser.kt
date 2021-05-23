package subtask3

class StringParser {
    fun getResult(inputString: String): Array<String> {
        val stack = mutableListOf<Pair<Char, Int>>()
        val result = mutableListOf<String>()
        for ((index, letter) in inputString.withIndex()) {
            when (letter) {
                '(' -> stack.add(letter to index)
                ')' -> stack.findLast { it.first == '(' }?.let {
                    result.add(inputString.slice(it.second + 1 until index))
                    stack.remove(it)
                }
                '[' -> stack.add(letter to index)
                ']' -> stack.findLast { it.first == '[' }?.let {
                    result.add(inputString.slice(it.second + 1 until index))
                    stack.remove(it)
                }
                '<' -> stack.add(letter to index)
                '>' -> stack.findLast { it.first == '<' }?.let {
                    result.add(inputString.slice(it.second + 1 until index))
                    stack.remove(it)
                }
            }
        }
        return result.sortedWith(Comparator { o1, o2 ->
            if (o2 in o1) {
                -1
            } else {
                0
            }
        }).toTypedArray()
    }
}
