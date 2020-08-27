fun main() {
    val listOfInt = listOf(1, null, 3, 4, 5, null, 7, 8, null, 10)
    for (i in listOfInt) {
        if (i == null) continue
        print(i)
    }
}