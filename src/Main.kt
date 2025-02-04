import ex1.fizzBuzz

fun main() {

    // ex1

    val result = fizzBuzz(15)
    println(result.joinToString(", "))

    // ex3

    val subject1 = Subject("Algebra", FieldOfStudy.Mathematics, 4, 5)
    val subject2 = Subject("Thermodynamics", FieldOfStudy.Physics, 2, 4)
    val subject3 = Subject("Web development", 3, 3) //  secondary constructor
    val subject4 = Subject("Anatomy", FieldOfStudy.Biology, 1, 2)

    val student1 = Student("Jan", "Kowalski", listOf(subject1, subject2))
    val student2 = Student("Kamil", "Heinrich", listOf(subject3, subject4))


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