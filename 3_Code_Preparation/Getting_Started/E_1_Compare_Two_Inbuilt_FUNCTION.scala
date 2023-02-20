import scala.io.StdIn.readInt;
object E_1_Compare_Two_Inbuilt_FUNCTION {
  def main(Args:Array[String]):Unit={
    print("Enter the first number :");
    var n:Int=readInt();
    print("Enter the second number :");
    var m:Int=readInt();
    var res:Int=Math.max(n,m);
    print(res);
  }
}
