import java.text.DecimalFormat

class Commercial constructor(propertyName: String, multiProperty: Boolean, customerName: String, customerPhone: String, customerAddress: String, squareFootage: Double):
     Customer(customerName, customerPhone, customerAddress, squareFootage)
{
     var propertyName = ""
     var multiProperty = false
     val rate = 5
     var round = DecimalFormat("$#,###.00")

     init {

          this.propertyName = propertyName
          this.multiProperty = multiProperty
     }

     fun calculate() {
          var charge = (rate / 1000.0) * squareFootage
          if (multiProperty)
          charge -= charge * 0.1
          var roundedCharge = round.format(charge)
          println("Name: $customerName | Phone: $customerPhone\n" +
                  "Address: $customerAddress | Square Footage: $squareFootage\n" +
                  "Property Name: $propertyName | Multi Property: $multiProperty\n" +
                  "Weekly Charge: $roundedCharge")

     }

}