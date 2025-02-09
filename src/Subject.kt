class Subject(private val name: String, private val hours: Int, val grade: Int) {

    private var field: FieldOfStudy

    constructor(name: String, field: FieldOfStudy, hours: Int, grade: Int) : this(name, hours, grade) {
        this.field = field
    }

    init {
        field = FieldOfStudy.Programming // temporary value
    }

    fun display() {
        println("Subject $name of field $field has $hours hours and grade $grade.")
    }
}