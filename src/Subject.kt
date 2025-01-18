class Subject(private val name: String, private var field: Field, private val hours: Int) {

    // secondary constructor
    constructor(name: String, hours: Int) : this(name, Field.Programming, hours)

    fun display() {
        println("Subject $name of field $field has $hours hours.")
    }
}
