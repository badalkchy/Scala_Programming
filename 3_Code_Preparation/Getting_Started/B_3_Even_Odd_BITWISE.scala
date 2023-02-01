import scala.io.StdIn.readInt;
object B_3_Even_Odd_BITWISE {
  def main(Args: Array[String]): Unit = {
    print("Enter the number :");
    var n: Int = readInt();
    if ((n & 1) == 0) {
      print("Even");
    }
    else {
      print("odd");
    }
  }
}
