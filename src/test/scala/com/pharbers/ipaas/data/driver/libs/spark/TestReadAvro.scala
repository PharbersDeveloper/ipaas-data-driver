package com.pharbers.ipaas.data.driver.libs.spark

import java.text.SimpleDateFormat
import java.util.Date

import com.pharbers.ipaas.data.driver.libs.spark.util.{readAvro, save2Avro}
import org.apache.spark.sql.DataFrame
import org.scalatest.FunSuite

class TestReadAvro extends FunSuite {
	implicit val sd: PhSparkDriver = PhSparkDriver("test-driver")
	sd.sc.setLogLevel("ERROR")
	test("read and save avro test") {
		val iString = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())
		import sd.ss.implicits._
		val df1: DataFrame = List(
			("name1", "prod1", "201701", 0.25),
			("name2", "prod2", "201702", 0.5),
			("name3", "prod1", "201801", 1.0),
			("name4", "prod2", "201802", 1.0)
		).toDF("NAME", "PROD", "DATE", "VALUE")
		val path = "hdfs:///test/avroTest/" + iString
		sd.setUtil(save2Avro()).save2Avro(df1, path)

		val df = sd.setUtil(readAvro()).readAvro(path)
		df.printSchema()
		df.show(false)
	}

	// read avro to rdd
	//	val path = "hdfs:///test/dcs/testLogs/testSink/topics/Pfizer_201804_Gycx_20181127_001/partition=0"
	//	val path = "hdfs:///test/dcs/testLogs/testSink/topics/Pfizer_201804_Gycx_20181127_001/partition=0/Pfizer_201804_Gycx_20181127_001+0+0000000000+0000001999.avro"
	//	val avroRDD = sd.sc.hadoopFile[AvroWrapper[GenericRecord], NullWritable, AvroInputFormat[GenericRecord]](path)
	//	val a = avroRDD.map(x => x._1.toString)
	//	a.take(10).foreach(println(_))
	//	avroRDD.map(l => new String(l._1.datum.get("username").toString())).first
}
