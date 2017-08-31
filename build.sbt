lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "org.nomadblacky",
      scalaVersion := "2.12.3",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "scala-introduction-for-java-developers",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.3" % "test",
      "junit" % "junit" % "4.12" % "test"
    )
  )
