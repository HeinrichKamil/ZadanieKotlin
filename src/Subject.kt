class Subject(
    private val name: String, private val field: FieldOfStudy, private val hours: Int, val grade: Int
) {

    // secondary constructor sets Programming as default value
    constructor(name: String, hours: Int, grade: Int) : this(name, FieldOfStudy.Programming, hours, grade)

    fun display() {
        println("Subject $name of field $field has $hours hours and grade $grade.")
    }
}
