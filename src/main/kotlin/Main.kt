fun main() {
    val commission = 0.75
    val minimumAmount = 3500

    val amount = 4500 //сумма в копейках

    if (amount > minimumAmount) {
        var result = amount / 100 * commission
        println("Сумма комиссии ")
        println(result)
    } else {
        println("Минимальная сумма перевода : 3500 копеек ")
    }

}