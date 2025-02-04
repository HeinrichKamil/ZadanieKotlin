class Subject(private val name: String, private val hours: Int, val grade: Int, private val field: FieldOfStudy? = null) {

    // Secondary constructor
    constructor(name: String, field: FieldOfStudy, hours: Int, grade: Int) : this(name, hours, grade, field)

    fun display() {
        println("Subject $name of field ${field ?: "undefined"} has $hours hours and grade $grade.")
    }
}
