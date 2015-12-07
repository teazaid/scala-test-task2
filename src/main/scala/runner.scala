import task.library.SalaryProcessor

/**
 * Created by Alexander on 07.12.2015.
 */
object runner {
  def main(arg: Array[String]): Unit = {
    val sc = new SalaryProcessor
    sc.displayGrossSalary(4)
  }
}
