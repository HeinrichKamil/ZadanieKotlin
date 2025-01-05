class Student(val name: String, val surname: String, private val grades: IntArray) {

    // srednia
    fun avg(): Double {
        return grades.average()
    }

    // czy srednia jest ponizej
    fun checkAvg(value: Double): Boolean {
        return avg() < value
    }
}
