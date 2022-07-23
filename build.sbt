course := "progfun1"
assignment := "forcomp"

scalaVersion := "2.13.4"

scalacOptions ++= Seq("-language:implicitConversions", "-deprecation")

libraryDependencies += "org.scalameta" %% "munit" % "0.7.26" % Test
