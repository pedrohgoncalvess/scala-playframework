package models
import collection.mutable

object taskUsers {
  private val users = mutable.Map[String,String]("Pedro" -> "pass")
  def validateUser(username:String, password:String): Boolean = {
    users.get(username).map(_ == password).getOrElse(false)
  }

  def createUser(username:String,password:String): Boolean = ???

  def getTasks(username:String): Seq[String] = ???

  def addTask(username:String,task:String): Unit = ???

  def removeTask(username:String,task:String): Unit = ???
}