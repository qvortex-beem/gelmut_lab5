class Contract(
    val clientName: String,
    val taslDescription: String,
    val reward: Int,
    val isUrgent: Boolean = false
) {
    fun printContractInfo() {
        println("Заказчик: $clientName")
        println("Задача: $taslDescription")
        println("Награда: $reward")
        println("Срочность: ${if (isUrgent) "Срочно!" else "Обычный контракт!"}")
    }
}