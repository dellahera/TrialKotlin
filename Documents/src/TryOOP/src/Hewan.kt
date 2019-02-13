abstract class Hewan(var name: String, var gender: String) {
    abstract fun bersuara()
    abstract fun berjalan()

    fun showInformation(){
        println("nama : $name")
        println("Gender : $gender")
    }
}

class Kucing(name: String, gender: String) : Hewan(name, gender){
    override fun berjalan() {
       println("Meooong, meoong")
    }

    override fun bersuara() {
      println("Kucing berjalan")
    }
}

class Kelinci(name: String, gender: String) : Hewan(name, gender){
    override fun berjalan() {
        println("Kutkutkut")
    }

    override fun bersuara() {
        println("Kelinci melompat")
    }
    fun gerakKuping(){
        println("Kelinci bisa menggerakkan kupingnya")
    }
}