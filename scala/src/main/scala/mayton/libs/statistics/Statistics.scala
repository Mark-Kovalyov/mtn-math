package mayton.libs.statistics

import scala.annotation.tailrec
import scala.collection.immutable
import scala.math.{pow, sqrt}
import scala.language.implicitConversions

object Statistics {

  object FromLazyHelper :
    // @tailrec
    implicit def fromLazyList[T](lazyList : LazyList[T]) : List[T] =
      if lazyList.isEmpty then
        Nil
      else
        lazyList.head :: fromLazyList(lazyList.tail)

  object ToLazyHelper :
    // @tailrec
    implicit def toLazyList[T](list : List[T]) : LazyList[T] =
      if list.isEmpty then
        LazyList.empty
      else
        list.head #:: toLazyList(list.tail)

  def mean(list : List[Double]) : Double = list.reduce((x,y) => x + y) / list.length

  def mean_safe(list : List[Double]) : Option[Double] =
    if list.isEmpty then
      None
    else
      Some(mean(list))

  /**
   * Дисперсией случайной величины называют математическое ожидание квадрата отклонения случайной величины от её математического ожидания.
   * @param list
   * @return
   */
  def disperse(list : List[Double]) : Double =
    val mx = mean(list)
    mean(list.map(x => x - mx).map(pow(_, 2)))


  /**
   * Среднеквадратическое отклонение определяется как квадратный корень из дисперсии случайной величины
   * @param list
   * @return
   */
  def stdev(list : List[Double]) : Double = sqrt(disperse(list))

  def mean(list : LazyList[Double]) : Double =
    @tailrec
    def mean(list : LazyList[Double], count : Int, sum : Double) : Double =
      if list.isEmpty then sum / count else mean(list.tail, count + 1, sum + list.head)
    return mean(list, 0, 0.0)

  def linearRegression(list : LazyList[Point[Double]]): (Double, Double) = {
    // TODO
    (0.0, 0.0)
  }






}
