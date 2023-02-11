package mayton.libs.statistics

import org.scalactic.Tolerance.convertNumericToPlusOrMinusWrapper
import org.scalactic.TolerantNumerics
import org.scalatest.funspec.AnyFunSpec

import scala.math.sin

class StatisticsSpec extends AnyFunSpec {

  describe("sinus function") {
    it ("should give 0 wher fi = 0") {
      assert(sin(0.0) === 0.0 +- 0.001)
    }
    it ("should give 1/2 wher fi = 30 degrees") {
      assert(sin(Math.PI / 6.0) === 0.5 +- 0.001)
    }
  }

}
