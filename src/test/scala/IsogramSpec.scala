import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import Isogram._
class IsogramSpec extends AnyFlatSpec with should.Matchers{
//  def isIsogram(s:String) = s match {
//    case "six-year-old" => true
//    case "downstream" => true
//    case "background" => true
//    case "lumberjacks" => true
//    case "isograms" => false
//  }
  it should  " return true for input  six-year-old"in {
    isIsogram("six-year-old") shouldBe true
  }
  it should  " return true for input  downstream"in {
    isIsogram("downstream") shouldBe true
  }
  it should  " return true for input  background"in {
    isIsogram("background") shouldBe true
  }
  it should  " return true for input  lumberjacks"in {
    isIsogram("lumberjacks") shouldBe true
  }
  it should  " return false for input  isograms "in {
    isIsogram("isograms") shouldBe false
  }
}
