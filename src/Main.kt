fun main() {
    val result = fizzBuzz(20)
    println(result.joinToString(", "))
}

fun fizzBuzz(n: Int): Array<String> {
    val array = Array(n) {""}
    var i = 0

    while (i < n) {
        val temp = i + 1
        if (temp % 3 == 0 && temp % 5 == 0) {
            array[i] = "FizzBuzz"
        }
        else if (temp % 3 == 0) {
            array[i] = "Fizz"
        }
        else if (temp % 5 == 0) {
            array[i] = "Buzz"
        }
        else {
            array[i] = temp.toString()
        }
        i++
    }
    return array
}
