import scala.concurrent.{ExecutionContext, Future}
implicit val ec:ExecutionContext= scala.concurrent.ExecutionContext.global

val fut1=Future{Thread.sleep(10000);
20 }
val fut2=Future{Thread.sleep(10000);
40 }
val result=for{
  x<-fut1
  y<-fut2
}
  yield
  {
  x + y
  }
fut1.value
fut2.value

fut1.value
fut2.value

result.value

result.value



val result1=for{
  num1<-Future{Thread.sleep(10000);
    20 }
  num2<- Future{Thread.sleep(10000);
    30 }
}
yield {
  num1 + num2
}



/*def multiply(implicit by: Int) = 4 * by
implicit val multiplier = 2
multiply*/

def add(implicit a: Int, b: Int) = 2 + a + b
implicit val a2=5

add



result1.value
result1.value


val result2=for{
  n1<-Future{Thread.sleep(1000);40}
  n2<-Future{Thread.sleep(2000);50}
  n3<-Future{Thread.sleep(3000);70}
}
yield n1 + n2 +n3
result2.value
result2.value