fun fizzBuzz(n: Int): Array<String> {
    val array = Array(n) {""}

    for (i in 1..n) {
        when {
            i % 3 == 0 && i % 5 == 0 -> array[i - 1] = "FizzBuzz"
            i % 3 == 0 -> array[i - 1] = "Fizz"
            i % 5 == 0 -> array[i - 1] = "Buzz"
            else -> array[i - 1] = i.toString()
        }
    }

    return array
}