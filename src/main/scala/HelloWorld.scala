import zio.*
import zhttp.http.*
import zhttp.service.Server
import zio.console.*

import java.io.IOException

object HelloWorld {
  // Create HTTP route
//  val app: HttpApp[Any, Nothing] = HttpApp.collect {
//    case Method.GET -> Root / "text" => Response.text("Hello World!")
//    case Method.GET -> Root / "json" => Response.jsonString("""{"greetings": "Hello World!"}""")
//  }
//
//  // Run it like any simple app
//  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] =
//    Server.start(8090, app.silent).exitCode

  def sayHello: ZIO[Console, IOException, Unit] =
    console.putStrLn("Hello, World!")
}