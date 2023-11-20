fun main(args: Array<String>){
    if(args.isEmpty()){
        println("Please enter number from command line as line argument")

    }
    val numbers = args.map {(it.toInt())}

    val smallest = numbers.minOrNull()
    val biggest = numbers.maxOrNull()

    println("The smallest number is: $smallest")
    println("The smallest number is: $biggest")
}