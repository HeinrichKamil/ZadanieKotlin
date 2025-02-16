class Student(val name: String, val surname: String, val subjects: List<Subject>) {
    fun avg(): Double {
        var sum = 0
        var count = 0

        for (subject in subjects) {
            sum += subject.grade
            count++
        }
        return sum.toDouble() / count
    }

    fun checkAvg(value: Double): Boolean {
        return avg() < value
    }
}
