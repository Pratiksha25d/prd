object Value {
  val value = 0;

  def main(args: Array[String]) = {
    println("Enter any number..")
    var v = scala.io.StdIn.readInt();
    val result = resultPerformer(v, value);
    println("Result = " + result)
  }

  def resultPerformer(v: Int, value: Int): Int = {
    if (v == 0) {
      value
    }
      else {
        if (v % 2 == 0) {
          resultPerformer(v / 2, value + 1)
      }   else
          resultPerformer(v-1, value + 1)
    }

  }
}
