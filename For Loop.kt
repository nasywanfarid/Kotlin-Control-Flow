fun main() {
    val ranges = 1.rangeTo(15) step 2
    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }
}