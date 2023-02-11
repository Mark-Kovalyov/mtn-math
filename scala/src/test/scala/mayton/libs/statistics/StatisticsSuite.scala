package mayton.libs.statistics

import org.scalatest.funsuite.AnyFunSuite

class StatisticsSuite extends AnyFunSuite {

  test("2 + 2 = 4") {
    assert(2 + 2 == 4)
  }

  test("Division by zero always throws error") {
    assertThrows[ArithmeticException](1 / 0)
  }

}
