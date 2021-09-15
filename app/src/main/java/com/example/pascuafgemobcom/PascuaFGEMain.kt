package com.example.pascuafgemobcom

fun main() {
    print("Enter first number: ")
    var num1 = readLine()!!.toDouble()
    do {
        print("Enter operator: ")
        var oper = readLine()

        if (oper == "+") {
           num1=sum(num1)
        }
        else if(oper=="-"){
            num1=diff(num1)
        }
        else if(oper=="*"){
            num1=prod(num1)
        }
        else if(oper=="/"){
            num1=quot(num1)
        }
        else if(oper=="="){
            println("Result of  computation is $num1")
        }
    } while (oper != "=")

}

//addition of inputs
fun sum(num1:Double):Double{
    print("Next number: ")
    var num2=readLine()!!.toDouble()
    var sum1=num1+num2
    return sum1
}

//subtraction of inputs
fun diff(num1:Double):Double{
    print("Next number: ")
    var num2=readLine()!!.toDouble()
    var diff1=num1-num2
    return diff1
}

//multiplication of inputs
fun prod(num1:Double):Double{
    print("Next number: ")
    var num2=readLine()!!.toDouble()
    var prod1=num1*num2
    return prod1
}

//division of inputs
fun quot(num1:Double):Double{
    print("Next number: ")
    var num2=readLine()!!.toDouble()
    if(num2!=0.0){ //if nonzero
        var quot1 = num1 / num2
        return quot1
    }
    else{ //if zero then back to ask operation
        println("Invalid division with zero!")
        return num1
    }

}




