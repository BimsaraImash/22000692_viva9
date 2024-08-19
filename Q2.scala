import scala.io.StdIn.readLine

object PatternMatching {
    def main(args:Array[String]): Unit = {
    val number = readLine("Enter the number : ").toInt;
    number match {
        case n if n <= 0    => println("Negative/Zero number");
        case n if n%2 == 0  => println("Even number is given");
        case _              => println("Odd number is given");
    }
}
}