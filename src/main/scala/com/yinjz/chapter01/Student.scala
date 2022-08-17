package com.yinjz.chapter01

class Student (name:String ,var age :Int){

  def printInfo = {
    println(name + " "+ age + " " + Student.school)
  }

}

object Student {
  val school : String = "shangguigu"

  def main(args: Array[String]): Unit = {
    val student1 : Student = new Student("zs",18)
    val student2 = new Student("ls",20)
    student1.printInfo
    student2.printInfo
  }

}
