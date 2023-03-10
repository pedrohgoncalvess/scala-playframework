package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import models.taskUsers


@Singleton
class Task @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def taskList = Action {
    val username = "Pedro"
    val tasks = taskUsers.getTasks(username)
    Ok(views.html.taskList(tasks))
  }

  def login = Action {
    Ok(views.html.login())
  }

  def validateLoginGet(username:String, password:String) = Action {
    Ok(s"Your login is username: $username | password: $password")
  }

  def valideLoginPost = Action { request =>
    val postVals = request.body.asFormUrlEncoded
    postVals.map { args =>
      val username = args("username").head
      val password = args("password").head
      if (taskUsers.validateUser(username, password)) {
        Redirect(routes.Task.taskList)
      } else {
        Redirect(routes.Task.login)
      }
    }.getOrElse(Redirect(routes.Task.login))
  }

  def createUser = {
    TODO
  }

  def product(prodType:String, prodNum:Int) = Action {
    Ok(s"Product: $prodType, product num: $prodNum")
  }
}
