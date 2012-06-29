object LazyValSample extends App {

  val normalVal = {
    println("Initializing normal val")
    "This is the normal val"
  }
  
  lazy val lazyVal = {
    println("Initializing lazy val")
    "This is the lazy val"
  }
  
  println("\n\nNo references have been made yet")
  println("Accessing normal val: ")
  println(normalVal)
  println("\n\nAccessing lazy val: ")
  println(lazyVal)
  println("\n\nAccessing lazy val a second time, there should be no initialization now: ")
  println(lazyVal)
  println("Accessing normal val again: ")
  println(normalVal)
}