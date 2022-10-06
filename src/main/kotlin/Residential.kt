import java.text.DecimalFormat

class Residential (isSenior: Boolean, customerName: String, customerPhone: String, customerAddress: String, squareFootage: Double):
    Customer(customerName, customerPhone, customerAddress, squareFootage)
{
    var isSenior = false
    val rate = 6
    var round = DecimalFormat("$#,###.00")

    init {
        this.isSenior = isSenior
    }

    fun calculate() {
        var charge = (rate / 1000.0) * squareFootage
        if (isSenior)
            charge -= charge * 0.15
        var roundedCharge = round.format(charge)
        println("Name: $customerName | Phone: $customerPhone\n" +
                "Address: $customerAddress | Square Footage: $squareFootage\n" +
                "Weekly Charge: $roundedCharge")

    }

}