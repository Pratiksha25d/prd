//List bt default its immutable
var a=List(1,2,3)
var s=List("prd","abc")

//Map
val  aMap=Map(1->"abc",2->"pqr")
val c=Map(1->23,2->25)

//Set
val mySet=Set(1,2,3)
val e=Set(1,"a",4)

var data=Set("pratiksha","prachi","vaishnavi","shruti")
for(datalength <- data)
{
  println(datalength.length)
}
var l =List(1)
println(l.tail)

println(s.init)
println(a.last)
println(s.reverse)
println(a.contains(1))
println(s.mkString("@"))


s.map(listdata => println(listdata))

a.map(elemOfA => println(elemOfA*elemOfA))
a.map(elemOfA => (elemOfA*elemOfA)).filter(elemOfA =>elemOfA%2==0)

a.map { eleA =>
  val s = eleA * eleA
  eleA.toString
}

//var l=List(1,2,2,4)
//l.filter(ldata => ldata%2==0)

val list=List(1,2,3,4,5)
def headElement(a:List[Int]): (Int, Int,Int) = (list.head, list.length,list.last)
headElement(list)

val pair=("abc",1,4,true)
pair._1
pair._2
pair._3
pair._4


//flatten
val name=List("a","b","c")
val num=List(1,2,3)
num.map(numA => name.map(nameA => numA + nameA )).flatten

//for comprehension (easy compare to flatten
val num1=List(1,2,3)
val num2=List(4,5,6)
val num3=List(4,5,6)
var flatterNum=
for{
  numA <-num1
  numB <-num2
  numC <-num3

}
  yield
    {
      numA * numB * numC
    }

val even=List(2,4,6).partition(evenl =>evenl % 2==0)
