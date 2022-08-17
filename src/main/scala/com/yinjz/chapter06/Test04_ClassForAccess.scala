package com.yinjz.chapter06

object Test04_ClassForAccess {

}

// 定义一个父类
class Person {
  private var idCard: String = "3523566"
  protected var name: String = "alice"
  var sex: String = "female"
  private[chapter06] var age: Int = 18

  def printInfo(): Unit = {
    println(s"p: $idCard $name $sex $age")
  }
}