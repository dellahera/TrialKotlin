fun main(args: Array<String>){
    val hewaan : Kucing = Kucing("Kuku", "Jantan")
    hewaan.showInformation()

    hewaan.berjalan()
    hewaan.bersuara()

    val kelinci : Kelinci = Kelinci("Puci", "Betina")
    kelinci.showInformation()
    kelinci.gerakKuping()
    kelinci.berjalan()
    kelinci.bersuara()

    val studenPresenter = StudentPresenter(object : Callback{
        override fun onGetStudentListFailure(msgErr: String) {
            println(msgErr)
        }

        override fun onGetStudentListSucces(students: List<Stundent>) {
            students.forEach {
                println("nama : ${it.name}")
                println("Nilai : ${it.score}")
            }
        }
    })

    studenPresenter.insertStudent(Stundent("della", 90))
    studenPresenter.insertStudent(Stundent("herli", 85))
    studenPresenter.insertStudent(Stundent("haha", 60))

    studenPresenter.getStudentList()
    println("=====")
    studenPresenter.getSmartStudent()


}