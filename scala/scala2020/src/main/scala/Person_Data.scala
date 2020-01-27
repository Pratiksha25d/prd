case class Person_Data(name:String, age:Int){

}
class PersonService {
  @throws(classOf[InvalidAge])
  def isRetired(person: Person_Data): Any = {
    if (person.age <= 0) {
      throw new InvalidAge("Invalid Age")
    }
    else
      false
  }

  def isValidName(person: Person_Data): Boolean = {
    if (person.name.length <= 3) {
      false
    }
    else
      true
  }

}

