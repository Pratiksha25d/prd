class MyException extends Exception (msg:String){
  println(msg)
}

object Main {

  def main(args:Array[String]){
    var age=0;
    try{
      isRetired(age);
    }
    catch{
     case e : Exception => println("Exception Occured : "+e)  
    }


  }
  
  def isRetired(age:Int):Boolean= {
    if(age<=0){
      throw new MyException("Invalid age")
    }
    else
      false
  }

}
