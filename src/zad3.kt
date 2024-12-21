fun main() {
    loop@ for (i in 1..10) {
        println("główna pętla $i: ")
        for (j in 1..20) {
            if (i == 10){
                println("stop")
                break@loop
            }
            else if (j == 15){
                println("stop")
                break
            }
            println(j)

        }

    }
}
