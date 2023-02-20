import scala.io.StdIn.readInt;
object E_3_Compare_two_FUNCTION_Unit {
  def Max(n:Int,m:Int):Unit={
    if(n==m){
      print("Both are equal ");
      return;
    }
    var res:Int= if(n>m) n else m;
    print(res+" is maximum");
    return;
  }
  def main(Args:Array[String]):Unit={
    print("Enter the first number :");
    var n:Int=readInt();
    print("Enter the second number :");
    var m:Int=readInt();
    Max(n,m);
  }
}
