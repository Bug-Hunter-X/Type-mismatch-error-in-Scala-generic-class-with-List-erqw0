```scala
class MyClass[T](val value: T) {
  def printValue(): Unit = {
    println(value)
  }
}

object MainObject {
  def main(args: Array[String]): Unit = {
    val myInt = new MyClass(10)
    myInt.printValue() // Works fine

    val myString = new MyClass("Hello")
    myString.printValue() // Works fine

    //Solution: Explicitly specify the type parameter
    val myList = new MyClass[List[Int]](List(1, 2, 3))
    myList.printValue() // Works fine now
  }
}
```