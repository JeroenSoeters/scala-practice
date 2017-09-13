
object StringCalculator {

  def add(x: String, y: String): String =
    addAux(x, y, false, "")

  private def addAux(x: String, y: String, carry: Boolean, acc: String): String = {
    (x.length == 0, y.length == 0) match {
      case (true, true) => if (carry) "1" + acc else acc
      case (true, false) => addAux(x, y.substring(0, y.length - 1), false, y.substring(y.length - 1) + acc)
      case (false, true) => addAux(x.substring(0, x.length - 1), y, false, x.substring(x.length - 1) + acc)
      case _ =>
        val xInt = Integer.parseInt(x.substring(x.length - 1))
        val yInt = Integer.parseInt(y.substring(y.length - 1))
        val resInt = xInt + yInt + (if (carry) 1 else 0)
        val resString = resInt.toString
        addAux(x.substring(0, x.length - 1), y.substring(0, y.length - 1), resInt > 10, resString.substring(resString.length - 1) + acc)
    }
  }
}
