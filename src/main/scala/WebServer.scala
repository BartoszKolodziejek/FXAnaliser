


import akka.http.scaladsl.model.{ContentTypes, HttpEntity}
import akka.http.scaladsl.server.{HttpApp, Route}
import org.ddahl.rscala.RClient


object WebServer extends HttpApp{
  override protected def routes: Route = {
    path("hello") {
      get {
        complete(HttpEntity(ContentTypes.`text/html(UTF-8)`, "<h1>Say hello to akka-http</h1>"))
      }
    }
    path("get_result"){
      get{
      parameters('open.as[String], 'close.as[String], 'type.as[String]) { (open, close, typ) =>
        val op = BigDecimal.apply(open)
        val cl = BigDecimal.apply(close)
        var result : BigDecimal = null
        if(typ.equals("BUY")){result = op-cl}
        else {result = cl-op}
        complete(HttpEntity(ContentTypes.`application/json`,"result:".concat(result.toString())))
      }
    }

    }
  }

  def main(args: Array[String]): Unit = {
    WebServer.startServer("localhost", 2137)
  }
  // Starting the server

}
