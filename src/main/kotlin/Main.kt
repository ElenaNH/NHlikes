fun main(args: Array<String>) {
    val likes: Int = 9

    /*println("(likes % 10)=${likes % 10}")
    println("(likes / 10)=${likes / 10}")
    println("((likes / 10) % 10)=${(likes / 10) % 10}")*/

    val word: String = if ((likes % 10 == 1) && ((likes / 10) % 10 != 1)) {
        "лайк"
    } else if ((likes % 10 >= 1) && (likes % 10 <= 4) && ((likes / 10) % 10 != 1)) {
        "лайка"
    } else {
        "лайков"
    }
    println("У вас $likes $word")

}