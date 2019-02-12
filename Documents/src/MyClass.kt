class MyClass {
    private val name= "Della"
    val nim = "16/394080/PA/17171"

    fun showInformation(){
        val name= "Hera"
        println(message = "Name : ${this.name}")
        println("Name : $name")
        println("NIM : $nim")
    }

}

data class MHS(val nama: String , val nim :String, val umur: Int)
data class Orang(val name: String, val umur : Int)

open class Hewan{
    protected var nama :String = ""
    protected var jeniskelamin = ""
    protected var jenis: String = ""
    protected var suara: String= ""
    protected var umur : Int= 0

    fun suaraHewan(x: String ){
        if (x== "Kucing") suara="Meong"
        else if (x=="Sapo") suara = "moo"
        else if (x=="Anjing") suara= "gukguk"
    }
}

class Kucing(nama: String , umur: Int, gender: String) : Hewan(){
    init {
        this.nama= nama
        this.umur= umur
        jeniskelamin= gender
    }

}

class Calculator{
    fun penjumlahan(x: Int,y: Int )= x+y
    fun pengurangan(x: Int, y: Int)= x-y
    fun perkalian(x: Int, y: Int)= x*y
    fun pembagian(x: Int, y: Int)= x/y
}
fun main(args: Array<String>){
    println("Test")
    val mhs= MyClass()      //membuat object dan memanggil constructor
    mhs.showInformation()

    val orang = Orang("Della", 21)
    println("Nama : ${orang.name}")
    println("Umur : ${orang.umur}")

    val person = MHS("Della hera", "394080", 21)
    //data gabisa diubah karena berupa konstanta "val", bisa diupdate kalau berupa variabel biasa
    println ("Data ${person.nama} nim ${person.nim} berumur ${person.umur}")

    var hitung = Calculator()
    println(hitung.pembagian(1,2))
    println(hitung.penjumlahan(1,2))
    println(hitung.perkalian(1,2))
    println(hitung.pengurangan(1,2))
}