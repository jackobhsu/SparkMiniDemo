package com.uitox.jackob

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf


object SparkDemo {
  def main(args: Array[String]) = { 

     //val conf = new org.apache.spark.SparkConf("mesos://zk://hadoop04.idc1.ux:2181/mesos" , "Jackob Spark Demo","/opt/spark","sparkdemo_2.10-1.0.0.jar" ) 
     val conf = new SparkConf() 
     conf.setAppName("Jackob Spark Demo")
 //    conf.setMaster("mesos://10.1.56.163:5050")
     conf.setMaster("spark://10.1.56.163:7077")
//     conf.setMaster("local[4]")
     conf.setSparkHome("/opt/spark")
     conf.setJars(Seq("/root/soft_src/spark_demo/target/scala-2.10/sparkdemo_2.10-1.0.0.jar"))

     val sc = new SparkContext(conf)
         
     val data = Array(1, 2, 3, 4, 5)
     val distData = sc.parallelize(data)
     println(distData.count())
     println("Hi!")
     sc.stop()
  }
}

