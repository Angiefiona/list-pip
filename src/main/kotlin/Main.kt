fun main() {
    println(sumArray(45,20, 12, 42))
//var sumElement = sumArray(45,20,12,42)
    //println(sumElement)

    println(evenElements(arrayOf(45,23,4,5,67,78,345)).contentToString())
    var y= arrayOf(35,56,78,64,56)
    var z= arrayOf(56,35,45,64,2)
    var s= twoArrays(y,z)

    println(s.contentToString())
}
//Write a Kotlin function that takes an array of integers as input and returns
// the sum of all the elements in the array.
fun sumArray(num1:Int, num2:Int, num3:Int, num4:Int): Int{
    var sumElements = arrayOf(num1, num2, num3, num4)
    return sumElements.sum()
}
//Write a Kotlin function that takes two arrays of integers as input and returns a
//new array that contains the elements that are common to both input arrays.
fun twoArrays(nums:Array<Int>, num2: Array<Int>):Array<Int>{
    var x = mutableListOf<Int>()
    for (i in nums)
        if (i in num2){
            x.add(i)
        }
    return x.toTypedArray()
}

//Write a Kotlin function that takes an array of integers as input and returns a new array
//that contains only the even elements of the input array.
fun evenElements(array:Array<Int>):Array<Int>{
    var y= mutableListOf<Int>()
    for(x in array)
        if(x%2==0){
            y.add(x)

    }
    return y.toTypedArray()
}

