object printargs {
  def main(args: Array[String]): Unit = {
    var z =new Array[String](0)
     //z=Array("zara","abc","pqr")
    //args.foreach(arg =>println(arg))
    for(arg <- args)
      println(arg)
  }

}
