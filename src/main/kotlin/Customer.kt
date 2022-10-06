open class Customer constructor(customerName: String, customerPhone: String, customerAddress: String, squareFootage: Double) {

    var customerName = ""
        get() = field
        set(value) {
            field = value
        }
    var customerPhone = ""
        get() = field
        set(value) {
            field = value
        }
    var customerAddress = ""
        get() = field
        set(value) {
            field = value
        }
    var squareFootage = 0.0
        get() = field
        set(value) {
            field = value
        }


    init {
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerAddress = customerAddress
        this.squareFootage = squareFootage
    }


}