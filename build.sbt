val scala3Version = "3.0.0"
val zioVersion    = "1.0.9"
val zhttpVersion  = "1.0.0.0-RC17"
lazy val root     = project
  .in(file("."))
  .settings(
    name := "cool-kids-project",
    version := "0.1.0",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "dev.zio"     %% "zio"               % zioVersion,
      "io.d11"      %% "zhttp"             % zhttpVersion,
//      "io.d11"      %% "zhttp-test"        % zhttpVersion % Test,
//      "com.novocode" % "junit-interface"   % "0.11"     % Test,
      "dev.zio"     %% "zio-test-junit"    % zioVersion % Test,
      "dev.zio"     %% "zio-test"          % zioVersion % Test,
      "dev.zio"     %% "zio-test-sbt"      % zioVersion % Test,
      "dev.zio"     %% "zio-test-magnolia" % zioVersion % Test, // optional
    ),
  )
testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
