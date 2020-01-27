import org.scalatest.{FunSpec, Matchers}

class OperationTest extends FunSpec with Matchers{
 describe ( "operations"){
   val opeartion = new Operations
   val expectedaddition = 30


   it("should take integers")
   {
     opeartion.add(20,10) should be (30)
   }
 }
}

