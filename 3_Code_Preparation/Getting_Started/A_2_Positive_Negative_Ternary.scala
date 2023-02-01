import scala.io.StdIn.readInt;
object A_2_Positive_Negative_Ternary {
  def main(Args:Array[String]):Unit={
    print("Enter the number :");
    var n:Int=readInt();
    var x:String="Positive";
    var y:String="Negative";
    var res=if(n>0) x else y;
    print(res);
  }
}
