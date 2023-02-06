import scala.io.StdIn.readInt;
object C_2_Sum_of_first_n_FORMULA {
  def main(Args:Array[String]):Unit={
    print("Enter the number :");
    var n:Int=readInt();
    var res:Int=(n*(n+1))/2;
    print("Sum of 1 to "+n+" is "+res);
  }
}
