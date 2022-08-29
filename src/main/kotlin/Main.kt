fun main(args: Array<String>) {
    val likes: Int = 520
    /*println("(likes % 10)=${likes % 10}")
    println("(likes / 10)=${likes / 10}")
    println("((likes / 10) % 10)=${(likes / 10) % 10}")*/

    val word: String = if ((likes % 10 == 1) && ((likes / 10) % 10 != 1)) {
        "человеку"
    } else {
        "людям"
    }
    println("Понравилось $likes $word")

}