import scala.util.control.Breaks.break

object Isogram {
  def isIsogram(s:String): Boolean={
    val cs = s.filter(_.isLetter).map(_.toLower)
    //toLowerCase so if first char is upper it wont escape in checking
    //toSet removes duplicates from cs
    //therfore if lengths arent equal it is not isogram
    cs.toSet.size == cs.size
  }
}
