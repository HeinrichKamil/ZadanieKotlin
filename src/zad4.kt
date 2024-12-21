val permissions = mapOf(
    "Alice" to listOf("read", "write"),
    "Charlie" to listOf("admin", "read"),
    "Kamil" to listOf("read", "write", "admin"),
    "Bob" to null,
    "Anne" to null,
    "Todd" to listOf("read")
)

fun hasAccess(name: String): String? {
    val userPermission = permissions[name]
    if(userPermission != null &&  "admin" in userPermission){
        return "$name has admin access."
    }
    else{
        return null
    }
}

fun main() {
    val result = hasAccess("Kamil") ?: "User doesnt have permission."
    println(result)
}
