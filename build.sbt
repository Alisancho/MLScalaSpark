name := "MLScalaSpark"

version := "0.1"

scalaVersion := "2.12.11"

val spark = "3.0.0-preview2"


libraryDependencies += "org.apache.spark" %% "spark-core" % spark
libraryDependencies += "org.apache.spark" %% "spark-mllib" % spark % "runtime"
libraryDependencies += "org.apache.spark" %% "spark-sql" % spark
libraryDependencies += "org.apache.spark" %% "spark-streaming" % spark % "provided"
// https://mvnrepository.com/artifact/org.scalanlp/breeze
libraryDependencies += "org.scalanlp" %% "breeze" % "1.0"
// https://mvnrepository.com/artifact/org.scalanlp/breeze-natives
libraryDependencies += "org.scalanlp" %% "breeze-natives" % "1.0"
