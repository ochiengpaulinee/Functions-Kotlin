import java.util.*

fun main(){
println(sum(12,4))
    name("Pauline")
    remainder(21,10)
    sum(add = arrayOf(2,4,6,8,10,12))
    interesting("friends")
    loop(numb = arrayOf(12,14,16,18,20))
    sort(words = arrayOf("beth","zeddy","guide","york","banana"))
    indexs(n = arrayOf("house","home","jail","boy","girl"))
    even(t = arrayOf(1,2,4,5,6))

}
fun sum(num1:Int,num2:Int):Int{
    var c = num1+num2
    return c
}


//fun ints(vary:Int){
//    var g = arrayOf(2,5,8,10,12)
//    var sum =
//}


//Create and invoke a function that takes in a name and prints out “Hello ${name}” e.g
//given “Ada” it will print out “Hello Ada”
fun name(names:String){
    println("Hello ${names}")
}

//Create and invoke a function that given 2 numbers returns
// the remainder of their division

fun remainder(number1:Int,number2:Int){
    var rem = number1%number2
    println(rem)
}

//Create and invoke function that returns the sum
// of any given 4 numbers

fun sum(add:Array<Int>){
    var r = add.count()
    println(r)
}

//Create and invoke a function that
// prints out an interesting fact about yourself

fun interesting(myself:String){
    var x = "I love making new ${myself}"
    println(x)
}

fun loop(numb:Array<Int>){
    for (i in numb){
        println(i*2)
    }
}

fun sort(words:Array<String>){
    var d = words.sortedArray()
    println(Arrays.toString(d))
}

fun indexs(n:Array<String>){
    var index = n.indexOf("home")
    println(index)
}
fun even(t:Array<Int>){
    for(i in t){
        if(i*2==4){
            println(i)
        }
    }
}

