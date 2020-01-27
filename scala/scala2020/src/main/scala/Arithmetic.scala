object Arithmetic {
  def main(args:Array[String]): Unit = {
    println("Enter Users choice...!!")
    val c = scala.io.StdIn.readInt();
    val n1 =scala.io.StdIn.readInt();
    val n2 =scala.io.StdIn.readInt();
    val result = operations(c, n1, n2);
    println(result)
  }
  def operations(c:Int, a:Int, b:Int)={
    if(c==1)
      println(a + b)
    else if(c==2)
      println(a - b)
    else if(c==3)
      println(a / b)
    else
      println(a * b)
  }
}

