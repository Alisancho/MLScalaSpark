name := "MLScalaSpark"

version := "0.1"

scalaVersion := "2.12.11"

val spark = "3.0.0-preview2"
lazy val catsVersion       = "2.0.0"
lazy val catsEffectVersion = "2.0.0"
lazy val fs2Version        = "2.0.1"
lazy val quillVersion      = "3.4.10"
lazy val softwaremill      = "2.3.3"
lazy val tinkoffapi        = "0.4.1"

libraryDependencies += "org.apache.spark" %% "spark-core" % spark
libraryDependencies += "org.apache.spark" %% "spark-mllib" % spark % "runtime"
libraryDependencies += "org.apache.spark" %% "spark-sql" % spark
libraryDependencies += "org.apache.spark" %% "spark-streaming" % spark % "provided"
libraryDependencies += "org.scalanlp" %% "breeze" % "1.0"
libraryDependencies += "org.scalanlp" %% "breeze-natives" % "1.0"

libraryDependencies ++= Seq(
  "io.getquill" %% "quill-jdbc-monix" % quillVersion,
  "io.getquill" %% "quill-core"       % quillVersion,
  "io.getquill" %% "quill-sql"        % quillVersion,
  "mysql" % "mysql-connector-java"    % "8.0.18"
)
libraryDependencies ++= Seq(
  "com.softwaremill.macwire" %% "macrosakka" % softwaremill % "provided",
  "com.softwaremill.macwire" %% "macros"     % softwaremill % "provided",
  "com.softwaremill.macwire" %% "proxy"      % softwaremill,
  "com.softwaremill.macwire" %% "util"       % softwaremill
)

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-effect" % catsEffectVersion,
  "org.typelevel" %% "cats-core"   % catsVersion,
  "co.fs2"        %% "fs2-core"    % fs2Version,
  "co.fs2"        %% "fs2-io"      % fs2Version
)
