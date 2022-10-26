package com.example.praticetestmakeperfect.mains.abstractSample

abstract class Employee(private val name : String, private val experience: Int) {

    abstract val salary : Double
    abstract fun workTypeDetail(workType:String)
    fun employeeDetail(){
        println("Employee name -> $name")
        println("Experience year -> $experience")
        println("Annual salary -> $salary")
    }

}

class Engineer(name: String, experience: Int, override val salary: Double) : Employee(name,experience){
    override fun workTypeDetail(workType: String) {
        println("And my work type is $workType and I always go to contractor outside.")
    }

}

class Programmer(name: String,experience: Int) : Employee(name,experience){
    override val salary: Double
        get() = 7000.0

    override fun workTypeDetail(workType: String) {
        println("And my work type is $workType and I work in IT company.")
    }
}

fun main(){
    val engineerObj = Engineer("Aung Aung",2,3000.0)
    engineerObj.employeeDetail()
    engineerObj.workTypeDetail("Engineer")

    val programmerObj = Programmer("Min Min",3)
    programmerObj.employeeDetail()
    programmerObj.workTypeDetail("Programmer")
}