package mayton.libs.statistics

import mayton.libs.statistics.Statistics.{ToLazyHelper, disperse, mean, mean_safe, stdev}
import mayton.libs.statistics.Statistics.FromLazyHelper.fromLazyList
import org.junit.Test
import org.junit.Assert.*

import scala.language.implicitConversions

class Test1:

  val empty : List[Double] = List()

  val singleton : List[Double] = List(13.0)

  val testList : List[Double] = List(2.0, 3.0, 5.0)

  val lazyList : LazyList[Double] = 2.0 #:: (3.0 #:: (5.0 #:: LazyList.empty))

  val lazyListConverted : LazyList[Double] = ToLazyHelper.toLazyList(testList)

  @Test def list_conversion() : Unit =
    assertEquals(testList, lazyList)
    assertEquals(testList, lazyListConverted)
    assertEquals(lazyList, lazyListConverted)


  @Test def test_mean(): Unit =
    assertEquals(None, mean_safe(empty))
    assertEquals(3.33, mean_safe(testList).get, 0.01)

    assertEquals(13.0, mean(singleton), 0.01)
    assertEquals(3.33, mean(testList), 0.01)
    assertEquals(3.33, mean(lazyList), 0.01)

  @Test def test_disp(): Unit =
    assertEquals(0.0, disperse(singleton), 0.01)
    assertEquals(1.55, disperse(testList), 0.01)

    assertEquals(3, testList.length)
    assertEquals(3, lazyList.length)
    assertEquals(1.55, disperse(lazyList), 0.01)

  @Test def test_stdev() : Unit =

    assertEquals(1.24, stdev(testList), 0.01)






