package task.library

import task.library.model._

import scala.util.Try

/**
 * Created by Alexander on 07.12.2015.
 */
sealed trait GrossCalculator {
  private val k = 1.23

  def gross(amount: Int): Double = amount * k
}

sealed trait SalaryExtractor {
  self: GrossCalculator =>

  def string2Int(value: String): Int = Try(value.toInt).getOrElse(0)

  def getSalary(userId: Int): Double =
    database.get(userId.toString) match {
      case Some(User(name, netSalary)) =>
        gross(string2Int(netSalary))
      case Some((name: String, netSalary: String)) =>
        gross(string2Int(netSalary))
      case _ => 0d
    }
}

sealed trait SalaryPrinter {
  self: SalaryExtractor =>

  def displayGrossSalary(userId: Int): Unit = {
    val grossSalary = getSalary(userId)

    println(grossSalary)
  }
}

class SalaryProcessor extends GrossCalculator with SalaryPrinter with SalaryExtractor




