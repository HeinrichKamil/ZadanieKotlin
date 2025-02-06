class Subject(private val name: String, private val hours: Int, val grade: Int) {

    private var field: FieldOfStudy = FieldOfStudy.UNDEFINED

    constructor(name: String, field: FieldOfStudy, hours: Int, grade: Int) : this(name, hours, grade) {
        this.field = field
    }

    fun display() {
        println("Subject $name of field $field has $hours hours and grade $grade.")
    }
}