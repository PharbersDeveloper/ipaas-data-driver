package com.pharbers.ipaas.data.driver.operators

import com.pharbers.ipaas.data.driver.api.work._

/**
  * @description:
  * @author: clock
  * @date: 2019-05-28 17:21
  */
case class addColumn(plugin: PhPluginTrait, name: String, defaultArgs: PhWorkArgs[_]) extends PhOperatorTrait {

    override def perform(pr: PhWorkArgs[_]): PhWorkArgs[_] = {
        val defaultMapArgs = defaultArgs.toMapArgs[PhWorkArgs[_]]
        val prMapArgs = pr.toMapArgs[PhWorkArgs[_]]
        val inDFName = defaultMapArgs.getAs[PhStringArgs]("inDFName").get.get
        val newColName = defaultMapArgs.getAs[PhStringArgs]("newColName").get.get
        val inDF = prMapArgs.getAs[PhDFArgs](inDFName).get.get
        val func = plugin.perform(pr).toColArgs.get
        val outDF = inDF.withColumn(newColName, func)

        PhDFArgs(outDF)
    }
}
