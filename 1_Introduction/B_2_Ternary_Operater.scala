import scala.io.StdIn.readInt;
object B_2_Ternary_Operater {
  def main(Args:Array[String]):Unit={
    print("Enter the number :");
    var n:Int=readInt;
    var E:String="Even";
    var O:String="Odd";
    var res:String = if((n%2)== 0) E else O;
    print(res);
  }
}
