import org.scalatest.{FunSpec, Matchers}
import org.scalatestplus.mockito.MockitoSugar

class Person_DataTest extends FunSpec with Matchers with MockitoSugar{
    describe("if age is zero."){
      val a= new PersonService
      val personObj= Person_Data("pratiksha", -1)
      it("should throw an exception"){
        assertThrows[InvalidAge]{
          a.isRetired(personObj)
        }
      }

    }
  describe("To check whether name conditions matched or not"){
    val n=new PersonService
    val pn=Person_Data("a",30)
    it("should be false"){

    }
  }

}

