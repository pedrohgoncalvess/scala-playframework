package models
import collection.mutable

object taskUsers {
  private val users = mutable.Map[String,String]("Pedro" -> "pass")
  private val tasks = mutable.Map[String, List[String]]("Pedro" -> List("Make videos","Eat","Sleep"))
  def validateUser(username:String, password:String): Boolean = {
    users.get(username).map(_ == password).getOrElse(false)
  }

  def createUser(username:String,password:String): Boolean = {
    if (users.contains(username)) false else {
      users(username) = password
      true
    }
  }

  def getTasks(username:String): Seq[String] = {
    tasks.get(username).getOrElse(Nil)
  }

  def addTask(username:String,task:String): Unit = ???

  def removeTask(username:String,task:String): Unit = ???
}