
import scala.util.{Failure, Success, Try}

case class Employee(id:Int, name:String, salary:Int )
def getEmployee(id:Int):Option[Employee] = {
  if(id>0 && id==1000)
    Some(Employee(1,"abc",1000))
  else
    None
}
val result1 =getEmployee(250)
result1.map(r=>println(r.id))
val result2 =getEmployee(0)
result2.map(r2=>println(r2.name))


//# Using Try,Success,Failure

def getDataEmployee(id:Int) = {
Try{
    if(id > 0 && id==1000)
    println("ID is present")
    else
        700/0
}
}
val op1=getDataEmployee(1000)
val op2=getDataEmployee(0)
op1 match {
    case Success(output) => println("ID is present "+output )
    case Failure(e) => println("error occured " + e)
}

op2 match{
    case Success(output) => println("ID is present "+output)
    case Failure(e) => println("error occured " + e)
}


def getInteger(input:String) = {
    try {
        Integer.parseInt(input)
    }catch {
        case nfe:NumberFormatException => throw new Exception("invalid input = " + input);
        case e:Exception => throw new Exception("something went wrong = " + e.getMessage);
    }
}
getInteger("2")


def tryGetInteger(input:String) = {
    Try {
        Integer.parseInt(input)
    }
}

val op1 = tryGetInteger("10")
val op2 = tryGetInteger("dummy")
op1 match {
    case Success(output) => println("operation success " + output)
    case Failure(e) => println("error occured " + e)
}

op2 match {
    case Success(output) => println("operation success " + output)
    case Failure(e) => println("error occured " + e)
}
op1.map(value => value +1)
op2.map(value => value +1)



def handleParsing(input:String) = {
    if(input!=null && input.nonEmpty) {
        input.toInt
    }
    else 0
}
handleParsing("2")
handleParsing(null)
handleParsing("")


