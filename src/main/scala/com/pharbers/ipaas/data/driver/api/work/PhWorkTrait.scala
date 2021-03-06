package com.pharbers.ipaas.data.driver.api.work

/**
  * @description:
  * @author: clock
  * @date: 2019-05-28 15:52
  */
sealed trait PhWorkTrait extends Serializable {
    val name: String
    val defaultArgs: PhWorkArgs[_]
    def perform(pr: PhWorkArgs[_]): PhWorkArgs[_]
}

trait PhPluginTrait extends PhWorkTrait

trait PhOperatorTrait extends PhWorkTrait

trait PhActionTrait extends PhWorkTrait {
    val operatorLst: List[PhOperatorTrait]
}

trait PhJobTrait extends PhWorkTrait {
    val actionLst: List[PhActionTrait]
}