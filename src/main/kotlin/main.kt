fun main() {

    do {
        println("Residental: 1\n" +
                "Commercial: 2\n" +
                "Quit: 3")
        print("Enter a number: ")
        var input = readln()!!.toInt()

        if(input == 1) {
            print("Enter name: ")
            var name = readln()!!.toString()
            print("Enter phone number: ")
            var phone = readln()!!.toString()
            print("Enter address: ")
            var address = readln()!!.toString()
            print("Enter if your are a senior: ")
            var isSenior = readln()!!.toBoolean()
            print("Enter square footage: ")
            var footage = readln()!!.toDouble()
            var customer = Residential(isSenior, name, phone, address, footage)
            customer.calculate()
        }
        else if (input == 2) {
            print("Enter name: ")
            var name = readln()!!.toString()
            print("Enter phone number: ")
            var phone = readln()!!.toString()
            print("Enter address: ")
            var address = readln()!!.toString()
            print("Enter name of property: ")
            var propertyName = readln()!!.toString()
            print("Enter if you have multiple properties: ")
            var multiProperty = readln()!!.toBoolean()
            print("Enter square footage: ")
            var footage = readln()!!.toDouble()
            var customer = Commercial(propertyName, multiProperty, name, phone, address, footage)
            customer.calculate()
        }
        else if (input != 1 || input != 2 || input != 3)
            println("Enter a valid number")
        else
            println("Goodbye")



    } while (input != 3 )
}