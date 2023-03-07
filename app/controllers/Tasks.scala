package controllers

import javax.inject._
import play.api._
import play.api.mvc._


@Singleton
class Task @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  def taskList = Action {
    Ok(views.html.TaskList(Seq("Nil","Pedro","Legal")))
  }
}
