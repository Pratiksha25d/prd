def add(a:Int, b:Int)= {
  println("a = " )
  println("b = " )
  a + b
}
def sub(c:Int, d:Int)={
  println("c = ")
  println("d = ")
  c - d
}
def showAdd(a:Int,b:Int) ={
  println("a = ")
  println("b = ")
  println(a + b)
}
val b=showAdd(3,2)
println(b)
b.getClass()

def floatValue(a:Int) = {
  if(a ==1)
    1.0
  else
    2.0f
}
floatValue(1)

def anyMethod(a:Int) = {
  if(a ==1)
    "String"
  else
    Set("1","2","3")
}
anyMethod(1)

def anyMethodx(a:Int)={
  if(a==1)
    true
  else
    2.0
}

def anyMethody(a:Int)={
  if(a==1)
    11
  else
    0.1f
}

def anyMethodz(a:Int)={
  if(a==1)
    false
  else
    2.0
}
anyMethodz(1)


