fun main() {
    val commission = 0.75
    val amount = 3500

    val sum = 1500 //сумма в копейках

    if (sum > amount) {
        var result = sum / 100 * commission
        println("Размер комиссии $result")
    } else {
        println("Размер комиссии $amount")
    }

}