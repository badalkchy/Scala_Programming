import scala.io.StdIn.readInt;
object C_2_While_Loop {
  def main(args: Array[String]): Unit = {
    print("Enter the number :");
    var n: Int = readInt();
    var a: Int = 1;
    while (a <= n) {
      print(a+" ");
      a = a + 1;
    }
  }
}
