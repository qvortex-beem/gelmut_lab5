class Spell(
    val name: String = "",
    val width: Int = 0,
    val height: Int = 0,
    val symbol: String = ""
    ) {
    // конструктор для квадратных заклинаний
    constructor(name: String, size: Int, symbol: String) : this(name, size, size, symbol)
    fun cast() {
        println("Кастуем $name")
        repeat (height) {
            repeat (width) {
                print(symbol)
            }
            println()
        }
    }
}