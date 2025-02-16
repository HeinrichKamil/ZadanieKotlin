class Subject(private val name: String, private val hours: Int, val grade: Int) {

    private var field: FieldOfStudy? = null

    constructor(name: String, field: FieldOfStudy, hours: Int, grade: Int) : this(name, hours, grade) {
        this.field = field
    }

    fun display() {
        val fieldText = field?.let { "of field $it " } ?: ""
        println("Subject $name ${fieldText}has $hours hours and grade $grade.")
    }
}