class Quest {
    val title: String
    val duration: Int
    val reward: Int
    val difficulty: String

    constructor (title: String, duration: Int, reward: Int, difficulty: String) {
      this.title = title
      this.duration = duration
      this.reward = reward
      this.difficulty = difficulty
    }

    fun printInfo() {
        println("Название квеста: ${this.title} \nВремя выполнения: ${this.duration} \nНаграда: ${this.reward} золотых \nУровень сложности: ${this.difficulty}\n")
    }
}