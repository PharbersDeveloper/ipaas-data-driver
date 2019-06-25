/*
 * This file is part of com.pharbers.ipaas-data-driver.
 *
 * com.pharbers.ipaas-data-driver is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * com.pharbers.ipaas-data-driver is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Foobar.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.pharbers.ipaas.data.driver.plugins

import com.pharbers.ipaas.data.driver.api.work.{PhColArgs, PhMapArgs, PhPluginTrait, PhStringArgs, PhWorkArgs}
import org.apache.spark.sql.Column
import org.apache.spark.sql.expressions.UserDefinedFunction
import org.apache.spark.sql.functions.{col, udf}

/** 将一个Seq[String]类型的字段去掉最后，将剩余元素一个并用空格分割后转换成String
  *
  * @author cui
  * @version 0.1
  * @since 2019/6/24 15:16
  * @example 默认参数例子
  * {{{
  *     splitedColName: String 要进行操作的列
  * }}}
  */
case class SplitPlugin(name: String,
                       defaultArgs: PhMapArgs[PhWorkArgs[Any]],
                       subPluginLst: Seq[PhPluginTrait[Column]])
	extends PhPluginTrait[Column] {
//	要转换的列名
	val splitedColName: String = defaultArgs.getAs[PhStringArgs]("splitedColName").get.get

	override def perform(pr: PhMapArgs[PhWorkArgs[Any]]): PhWorkArgs[Column] = {
		val formatFunc: UserDefinedFunction = udf { lst: Seq[String] => lst.dropRight(1).mkString(" ")}
		PhColArgs(formatFunc(col(splitedColName)))
	}
}
