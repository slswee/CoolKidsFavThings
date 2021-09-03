package com.coolkids.http4shelloworld

import cats.effect.{ExitCode, IO, IOApp}

object Main extends IOApp {
  def run(args: List[String]) =
    Http4shelloworldServer.stream[IO].compile.drain.as(ExitCode.Success)
}
