fun main() {
    val subject1 = Subject("Algebra", Field.Mathematics, 4)
    val subject2 = Subject("Thermodynamics", Field.Physics, 2)
    val subject3 = Subject("Web development", 3) // created with secondary constructor
    val subject4 = Subject("Anatomy", Field.Biology, 1)

    val student1 = Student("Jan", "Kowalski", intArrayOf(5, 4, 3, 1), listOf(subject1, subject2))
    val student2 = Student("Kamil", "Heinrich", intArrayOf(2, 6, 5, 4), listOf(subject3, subject4))

    println("${student1.name} subjects:")
    student1.subjects.forEach { it.display() }

    println("${student2.name} subjects:")
    student2.subjects.forEach { it.display() }

    println("Average grade ${student1.name}: ${student1.avg()}")
    println("Average grade ${student2.name}: ${student2.avg()}")

    val value = 4.0
    println("${student1.name} has average grade below $value: ${student1.checkAvg(value)}")
    println("${student2.name} has average grade below $value: ${student2.checkAvg(value)}")
}
