class Enemy(
    val name: String = "безымянный",
    var hp: Int = 1,
    val element: String = "обнинск"
) {

    fun takeDamage(amount: Int) {
        println("Получено $amount урона")
        hp -= amount
        if (hp < 0) hp = 0
        println("Осталось здоровья: $hp")
    }

    fun isStrong() : Boolean {
        return hp > 100
    }

    fun getThreatLevel(): String {
        return when {
            hp <= 50 -> "низкий"
            hp >= 150 -> "средний"
            else -> "высокий"
        }
    }


}