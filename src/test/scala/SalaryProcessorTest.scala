import org.scalatest._
import task.library.SalaryProcessor

/**
 * Created by Alexander on 07.12.2015.
 */
class SalaryProcessorTest extends FlatSpec with Matchers {
  val service = new SalaryProcessor

  it should "return salary for user with id = 1" in {
    service.getSalary(1) should be {
      24.6d
    }
  }

  it should "return salary for tuple2 with id = 2" in {
    service.getSalary(2) should be {
      30.75d
    }
  }

  it should "return 0 for id = 3" in {
    service.getSalary(3) should be {
      0d
    }
  }

  it should "return gross salary with k=1.23" in {
    service.gross(10) should be {
      12.3
    }
  }
}
