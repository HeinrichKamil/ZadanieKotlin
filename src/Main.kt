fun main() {
    fizzBuzz(20)
}

fun fizzBuzz(n: Int) {
    val array = Array<Any>(n){}
    var i = 0

    while (i < n) {
        val temp = i+1
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
            array[i] = temp
        }
        i++
    }
    System.out.println(array.joinToString(separator = ", "))
}
