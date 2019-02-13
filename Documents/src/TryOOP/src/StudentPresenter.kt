class StudentPresenter( val callback : Callback) {
     private val studentList= mutableListOf<Stundent>()

    fun getStudentList(){
       passDataToCall(studentList)
    }
    fun getSmartStudent(){
        var smartStudent= studentList.filter { it.score >= 70
        }
        passDataToCall(smartStudent)
    }

    fun passDataToCall(student: List<Stundent>){
        if(studentList.isNotEmpty()){
            callback.onGetStudentListSucces(student)
        } else {
            callback.onGetStudentListFailure("Student is empty")
        }
    }
    fun insertStudent(student: Stundent){
        studentList.add(student)
    }
}

interface Callback{
    fun onGetStudentListSucces(students: List<Stundent>)
    fun onGetStudentListFailure(msgErr: String)
}