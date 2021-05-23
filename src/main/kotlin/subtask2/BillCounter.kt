package subtask2

class BillCounter {
    private val fairlySplit = "bon appetit"

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        val sum = bill.filterIndexed { index, _ -> index != k }.sum() / 2
        return if (sum == b) fairlySplit else (b - sum).toString()
    }
}
