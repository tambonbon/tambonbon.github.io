package controllers

import play.api.mvc.{AbstractController, ControllerComponents}
import play.api.mvc._

import javax.inject.Inject

class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc){
    def index: Action[AnyContent] = Action { implicit request =>
        Ok(views.html.index("Hello World"))
    }
}
