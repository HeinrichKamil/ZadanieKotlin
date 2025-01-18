class Student(val name: String, val surname: String, val subjects: List<Subject>) {
    fun avg(): Double {

    }

    fun checkAvg(value: Double): Boolean {
        return avg() < value
    }
}
