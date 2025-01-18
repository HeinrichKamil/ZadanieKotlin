fun main() {

    // ex1

    val result = fizzBuzz(15)
    println(result.joinToString(", "))

    // ex3

    val subject1 = Subject("Algebra", Field.Mathematics, 4)
    val subject2 = Subject("Thermodynamics", Field.Physics, 2)
    val subject3 = Subject("Web development", 3) // created with secondary constructor
    val subject4 = Subject("Anatomy", Field.Biology, 1)

    val student1 = Student("Jan", "Kowalski", subject1)
    val student2 = Student("Kamil", "Heinrich")

    println("${student1.name} ${student1.surname}:")
    subject1.display()
    subject2.display()

    println("${student2.name} ${student2.surname}:")
    subject3.display()
    subject4.display()

    println("Average grade ${student1.name}: ${student1.avg()}")
    println("Average grade ${student2.name}: ${student2.avg()}")

    val value = 4.0

    println("${student1.name} has average grade below $value: ${student1.checkAvg(value)}")
    println("${student2.name} has average grade below $value: ${student2.checkAvg(value)}")

}