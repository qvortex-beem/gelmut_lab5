class Enemy {
    val name: String
    var hp: Int
    val element: String

    constructor(name: String, hp: Int, element: String) {
        this.name = name
        this.hp = hp
        this.element = element
    }

    fun takeDamage(amount: Int) {
        println("Получено $amount урона")
        hp -= amount
        if (hp < 0) hp = 0
        println("Осталось здоровья: $hp")
    }
}