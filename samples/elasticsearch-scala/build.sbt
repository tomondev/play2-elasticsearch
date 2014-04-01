import play.Project._

name         := "elasticsearch-scala-sample"

version      := "1.0-SNAPSHOT"

play.Project.playScalaSettings

lazy val esModule = RootProject(file("../../module"))

lazy val root = project.in(file(".")).dependsOn(esModule).aggregate(esModule)