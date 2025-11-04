class Item {
    val name: String
    val price: Int

    constructor(
        name: String,
        price: Int
    ) {
        this.name = name
        this.price = price
    }

    fun displayInfo() {
        println("Товар: $name, цена: $price")
    }
}