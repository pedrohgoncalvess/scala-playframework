package controllers

import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class Task @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def taskList = Action {
    val tasks = List("Sleep","Studie","Code","Work")
    Ok(views.html.taskList(tasks))
  }

  def login = Action {
    Ok(views.html.login())
  }

  def validateLogin(username:String, password:String) = Action {
    Ok(s"Your login is username: $username | password: $password")
  }

  def product(prodType:String, prodNum:Int) = Action {
    Ok(s"Product: $prodType, product num: $prodNum")
  }
}
