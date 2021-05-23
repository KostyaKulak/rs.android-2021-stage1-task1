package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        var index = 0
        val array = sadArray.toMutableList()
        while (index < array.size - 1) {
            if (index > 0 && index < array.size) {
                if (array[index] > array[index - 1] + array[index + 1]) {
                    array.removeAt(index)
                    index = 0
                    continue
                }
            }
            index++
        }
        return array.toIntArray()
    }
}
