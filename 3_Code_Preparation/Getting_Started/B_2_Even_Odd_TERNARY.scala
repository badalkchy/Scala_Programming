import scala.io.StdIn.readInt;
object B_2_Even_Odd_TERNARY {
  def main(Args: Array[String]): Unit = {
    print("Enter the number :");
    var n: Int = readInt();
    var a: String = "Even";
    var b: String = "Odd";
    var res: String = if (n % 2 == 0) a else b;
    print(res);
  }
}
