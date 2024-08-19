import scala.io.StdIn.readLine

object interest {
    val interestRate: Double => Double = (deposit: Double) => deposit match {
        case d if d <= 20000   => 0.02
        case d if d <= 200000  => 0.04
        case d if d <= 2000000 => 0.035
        case _                 => 0.065
    }
    val calculateInterest: Double => Double = (deposit: Double) => {
        deposit * interestRate(deposit);
    }
     def main(args:Array[String]): Unit = {
        val depositValue = readLine("Please enter your deposit amount (Rs): ")
        val deposit = depositValue.toDouble
        val interest = calculateInterest(deposit)
        println(f"Deposit: Rs. $deposit%.2f, Interest Earned: Rs. $interest%.2f")

    } 
}