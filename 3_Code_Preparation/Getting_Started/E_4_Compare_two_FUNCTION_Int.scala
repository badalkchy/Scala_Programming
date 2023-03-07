import scala.io.StdIn.readInt;
object E_4_Compare_two_FUNCTION_Int {
  def Max(n:Int,m:Int):Int={
    if(n==m){
      print("Both are equal");
      return 0;
    }
    var res:Int= if(n>m) n else m;
    return res;
  }
  def main(Args:Array[String]):Unit={
    print("Enter the first number :");
    var n:Int=readInt();
    print("Enter the second number :");
    var m:Int=readInt();
    print(Max(n,m));
  }
}
