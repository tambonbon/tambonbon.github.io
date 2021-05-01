import org.scalajs.dom
import org.scalajs.dom.document
import shared.SharedMessage

object Main {
  def main(args: Array[String]): Unit = {
    println("This is Scala.js")
    
    if (dom.document.getElementById("scalaJSShoutOut") != null) {
      dom.document.getElementById("scalaJSShoutOut").textContent = SharedMessage.itWorks
    }
    appendPar(document.body, "This is Scala.js")
  }
  
  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }
}

