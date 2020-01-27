class Operations {
  def main(args:Array[String]): Unit = {
    println("Enter Users choice...!!")
    println("1.Addition \t" +
      "2.Substraction \t" +
      "3.Division\t" +
      "4.Multiplication")
    val c = scala.io.StdIn.readInt();
    println("Enter two numbers ")
    val n1=scala.io.StdIn.readInt();
    val n2=scala.io.StdIn.readInt();
    val result=operations(c,n1, n2)
    println("Result=" +result)
  }

  def operations(c:Int, a:Int,b:Int)={
    if(c==1)
      add(a,b)
    else if(c==2)
      sub(a, b)
    else if(c==3)
      div(a,b)
    else
      mult(a,b)
  }
  def add(a:Int,b:Int)={
    a + b
  }
  def sub(a:Int,b:Int)={
    a - b
  }
  def div(a:Int,b:Int)={
    a / b
  }
  def mult(a:Int,b:Int)={
    a * b
  }
}
