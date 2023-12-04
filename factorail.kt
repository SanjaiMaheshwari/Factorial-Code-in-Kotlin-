import java.util.Scanner

fun main()
{

    // for loop
    val a = 1

    var fac=1

    val input = Scanner(System.`in`)

    println("Enter a Num ")

    var num = input.nextInt()

    for (a in a..num)
    {
        fac = fac*a
    }
    println(fac)


    // while loop

    var c = 1
    var factorial = 1

    println("Enter num by user ")
    var number = input.nextInt()

    while (c<=num) {

        factorial = factorial * c
        c++
    }
    println(factorial)
}
