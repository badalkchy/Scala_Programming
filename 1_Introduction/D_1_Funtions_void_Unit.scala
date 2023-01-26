import scala.io.StdIn.readInt;
object D_1_Funtions_void_Unit {
  def Sum(n:Int,m:Int): Unit = {
    var sum:Int=n+m;
    print(sum);
    return;
  }
  def main(Args:Array[String]):Unit={
    print("Enter the two number :");
    var n:Int=readInt();
    var m:Int=readInt();
    Sum(n,m);
  }
}
