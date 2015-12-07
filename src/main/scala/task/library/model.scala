package task.library

/**
 * Created by Alexander on 07.12.2015.
 */
object model{
  case class User(name: String, netSalary: String)
  val database = Map("1" -> User("John", "20"), "2" ->("Alice", "25"))
}
