package mayton.libs.statistics

import mayton.libs.statistics.Statistics.fact
import org.scalatest.wordspec.AnyWordSpec

class StatisticAnyWordSpec extends AnyWordSpec {

  "A factorial function" should {
    "give 1 when x = 1 or x = 0" in {
      assert(fact(0) == 1)
      assert(fact(1) == 1)
    }
    "throws an exception wher argument is negative" in {
      assertThrows[AssertionError](fact(-1))
    }
  }

}
