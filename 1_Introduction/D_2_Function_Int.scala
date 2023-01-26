import scala.io.StdIn.readInt;
object D_2_Function_Int {
  def Sum(a:Int,b:Int): Int = {
    var sum:Int=a+b;
    return sum;
  }
  def main(Args:Array[String]):Unit={
    print("Enter the two number :");
    var n:Int=readInt();
    var m:Int=readInt();
    print(Sum(n,m));
  }
}
