import org.scalatest.FunSuite

class StringAdditionTests extends FunSuite {

  test("adding two strings") {

    assert(StringCalculator.add("122", "345") == "467")
    assert(StringCalculator.add("1222", "345") == "1567")
    assert(StringCalculator.add("9", "9") == "18")
  }

}
