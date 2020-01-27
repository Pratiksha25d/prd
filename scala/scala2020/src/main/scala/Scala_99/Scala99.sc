import scala.collection.immutable

// #1 Find the last element of a list.
def last(num: List[Int]) = {
  num.last
}
last(List(1, 1, 2, 3, 5, 8))

// #2 Find the last but one element of a list.
def penultimate(num: List[Int]) = {
  num.init.last
}
penultimate(List(1,2,3,4,5))

//#3 Find the Kth element of a list.
def kth(num: List[Int],index: Int) = {
  num(index)
}
kth(List(5,6,7,8,9),4)


//#4  Find the number of elements of a list.
def length(num: List[Int]) = {
  num.length
}
length(List(1,2,3,4))


//#5 Reverse a list.
def reverse(names: List[String]) = {
  names.reverse
}
reverse(List("abc","pqr","def","xyz"))

//#6 Find out whether a list is a palindrome.
def palindrome(list1: List[Int]) = {
  val list2= list1.reverse
  list1 == list2
}
palindrome(List(1,2,1))

//#7 Flatten a nested list structure.
def flattenList[Int](list: List[List[Int]]) = {
  if (list.length==0)
    List[Int]()
  else
    list.head ++ list.tail

}
flattenList(List(List(1, 2, 3), List(4, 5, 6)))

//List(List(1, 2, 3), List(4, 5, 6)).flatten

//#8 Eliminate consecutive duplicates of list elements.
/*def conseDup(list : List[Int]) = {
  list match {
    case head::tail => {
      val (duplist,mainlist) = list.span(_ == head)
      duplist.head ::conseDup(mainlist) }
    case Nil => List()
  }
}
conseDup(List(1,2,2, 3,3,5,6,6,1,1,1))
*/