object TailHead {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5, 6)
    println(list)
    tailCall(list)
  }
  def tailCall(ListEle: List[Int]): Unit = {
    if (ListEle.nonEmpty) {
      println(ListEle.head)
      println(ListEle.tail)
      tailCall(ListEle.tail)
    }
  }
}
