fun main(args: Array<String>){
    print("Test")
    var names= arrayOf("della", "herli", "rahman")
    println(names)
    println("$names")


    names.forEach{
        println(it)
    }

    for(name in names){
        println(name)
    }
    for((i,name) in names.withIndex()){
        println("$name ke $i")
    }
    println()
    var data= listOf("haha", "hihi", "hoho")
    var test: Int= 0
    println("test $test $data ${data[1]}")
    for(i in 0..2 step 2){
        println("${names[i]} ${names.get(i)}")
    }
    var warnaList = listOf("Merah", "Kuning", "Hijau")
    for(i in 1..2){
        println(warnaList[i])
    }
    println()
    for(i in 0 until warnaList.size){
        println(warnaList[i])
    }
    var datahaha= mutableListOf<String>() //empty list
    var datahaha1: MutableList<String>? = null
    println(datahaha)

}