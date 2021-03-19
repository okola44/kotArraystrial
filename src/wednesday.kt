import java.util.*

fun main() {
    var placeArray= arrayOf("uganda","TANZANIA","nairobi")
    println(Arrays.toString(placeArray))
    var placeArray2=placeArray.plus("harare")
    println(Arrays.toString(placeArray2))
names()
    averageOf()
    imali()
    var b= sophie("sopphie","angela","happy","yasmin")
    println(Arrays.toString(b))
    place()
    name()
    println(addition(50,30))

}
fun names(){
    var namesArray=arrayOf("mercy","okola","alwel","sophie")
    var sort=namesArray.sortedArray()
    println(Arrays.toString(sort))
    var x=namesArray[0].capitalize()
    var y=namesArray[1].capitalize()
    var z=namesArray[2].capitalize()
    var p=namesArray[3].capitalize()
    println(Arrays.toString(namesArray))
    namesArray.set(2,"happy")
    println(Arrays.toString(namesArray))
    var index=namesArray.indexOf("happy")
    println(index)


}
fun averageOf(){
    var c= arrayOf(21,20,31,62,50,21,12,30,2)
    var total=c.sum()
    var size=c.count()
        println(total/size)

}
fun imali(){
    var d=arrayOf(21,30,31,10,20)
    d=d.sortedArray()
    for (number  in d) {
        println(number)
        }
    }
fun sophie(name1:String,name2:String,name3:String,name4:String):Array<String>{
    var b= arrayOf(name1,name2,name3,name4)
    return b

}
fun place(){
    var school="akiraChix"
    var x=school[0]
    var t=school[1]
    var p=school[3]
    println("$x,$t,$p")

}
fun name(){
    var b= arrayOf(1,2,3,4,5,6,)
    b.set(2,25)
    println(Arrays.toString(b))
    b=b.sortedArrayDescending()
    for (number in b){
        println(number)

    }
}
fun addition(a:Int,b:Int):Int{
    var sum=a+b
    return sum
}

