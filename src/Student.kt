class Student(val name: String, val surname: String, private val grades: IntArray, val subjects: List<Subject>) {
    fun avg(): Double {
        return grades.average()
    }

    fun checkAvg(value: Double): Boolean {
        return avg() < value
    }
}
