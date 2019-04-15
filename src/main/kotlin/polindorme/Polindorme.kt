package polindorme

fun isPolindorme(word: String): Boolean {
    val input: String = word.reversed()
    return input == word
}
