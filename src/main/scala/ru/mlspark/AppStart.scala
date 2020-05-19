package ru.mlspark

import org.apache.log4j.{Logger, Level}
import org.apache.spark.rdd.RDD
import org.apache.spark.storage.StorageLevel
import org.apache.spark.{SparkConf, SparkContext}

object AppStart extends App {
  Logger.getLogger("org").setLevel(Level.OFF)
  Logger.getLogger("akka").setLevel(Level.OFF)
  val fileName = "src/main/resources/black_list_friend.csv"
  val config = new SparkConf()
  config.setAppName("TesnProject")
  config.setMaster("local[8]")

  implicit val sc: SparkContext = new SparkContext(config)

  val data: RDD[String] = sc.textFile(fileName)

  val worsg: String => RDD[String] = X =>
    data
      .flatMap(
        x =>
          x.replaceAll(",", " ")
            .split(" ")
      )
      .filter(q => q.compareToIgnoreCase(X) == 0)

  println(worsg("ACCESS_DENIED").count())
  println(worsg("OK").count())

}
