package io.github.tambonbon.controllers

import javax.inject._

import io.github.tambonbon.shared._
import play.api.mvc._

@Singleton
class Application @Inject() (cc: ControllerComponents)
    extends AbstractController(cc) {

  def index = Action {
    Ok(views.html.index(SharedMessages.itWorks))
  }

  def playground01 = Action {
    val customer = Customer("Tammy Nguyen")
    val order = Order("Chicken")
    Ok(views.html.playground(customer, List(order)))
  }

}
