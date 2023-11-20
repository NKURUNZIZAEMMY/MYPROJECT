fun main() {
    println("Enter a number: ")
    val number = readLine()?.toIntOrNull()
    if (number != null && number in 1..999999) {
        val word = numberToWords(number)
        println("In words: $word")
    } else {
        println("Invalid Number!")
    }
}

fun numberToWords(number: Int): String {
    val units = arrayOf("", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
    val teens = arrayOf("", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen")
    val tens = arrayOf("", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety")

    return when {
        number < 10 -> units[number]
        number < 20 -> teens[number - 10]
        number < 100 -> "${tens[number / 10]} ${numberToWords(number % 10)}"
        number < 1000 -> "${units[number / 100]} hundred ${numberToWords(number % 100)}"
        number < 10000 -> "${numberToWords(number / 1000)} thousand ${numberToWords(number % 1000)}"
        number < 100000 -> "${numberToWords(number / 1000)} thousand ${numberToWords(number % 1000)}"
        else -> "Number out of range (up to 999999)"
    }
}

