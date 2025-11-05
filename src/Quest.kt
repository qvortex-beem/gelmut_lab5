class Quest(
    val title: String,
    val duration: Int,
    val reward: Int,
    val difficulty: String
) {

    fun printInfo() {
        println("Название квеста: ${this.title} \nВремя выполнения: ${this.duration} \nНаграда: ${this.reward} золотых \nУровень сложности: ${this.difficulty}\n")
    }

    fun isHard() : Boolean {
        return difficulty.lowercase() == "сложный"
    }
}