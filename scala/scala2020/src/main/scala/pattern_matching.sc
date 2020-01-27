//#Pattern matching(Similar to swich cases in other lang)
trait Car
object BMW extends Car
object Maruti extends Car
object Suzuki extends Car

def findCarType (car:Car) = {
  car match {
    case BMW => "BMW"
    case Maruti => "Maruti"
    case Suzuki => "Suzuki"
    case _ => "BMW"
  }
}
findCarType(BMW)
findCarType(new Car{})


def findType(a:Any) = a match{
  case s:String if(s.startsWith("a")) =>"String type with value"
  case s:String => "string type"
  case l:List[Any] =>"List type with head value" +l.head
  case c:Car =>"Car type"
  case t => t.getClass + "type"
}
findType(List(1,2,3))
findType("pratiksha")
findType("any")
findType(true)


def listRecursion(l:List[Int]):Unit = l match{
  case Nil =>println("empty")
  case head::Nil =>println(head +"last element")
  case head::tail => {
    println(head)
    listRecursion(tail)
  }
}
listRecursion(List(1,2,3))
listRecursion(List(3))
listRecursion(List())




trait Furniture
case class Chair(name:String,color:String,price:Int) extends Furniture
case class sofa(name:String,color:String)extends Furniture
case class table(name:String,price:Int) extends Furniture
def details(c:Chair) = {
  c match
  {
    case c:Chair if(c.price == 1000) => println("It's price is 1000rs")
    case _=>println("other details not available")
  }
}