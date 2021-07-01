val scala3Version = "3.0.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "cool-kids-project",
    version := "0.1.0",

    scalaVersion := scala3Version,

    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" %
      "test",
    libraryDependencies += "dev.zio" %% "zio" % "1.0.9",
    libraryDependencies += "io.d11" %% "zhttp" % "1.0.0.0-RC17"

  )
