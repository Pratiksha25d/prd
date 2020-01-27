trait Furniture
case class Chair(name:String,color:String,price:Int) extends Furniture
case class Sofa(name:String,color:String)extends Furniture
case class Table(name:String,price:Int) extends Furniture
object Pattern_Assign_one {
 def main(args:Array[String]): Unit ={
   detailsChair(Chair("simple","grey",1000))
   detailsChair(Chair("simple","grey",100))
   detailsSofa(Sofa("wood","wheat"))

 }
  def detailsChair(c:Chair) = {
    c match
      {
      case c:Chair if(c.price == 1000) => println("It's price is 1000rs")
      case _=>println("other details not available")
    }
  }
  def detailsSofa(s:Sofa) = {
    s match{
      case s:Sofa if(s.color == "black") => println("color is black")
      case Sofa(wood,wheat) => "Sofa is perfect"
    }
  }
}
