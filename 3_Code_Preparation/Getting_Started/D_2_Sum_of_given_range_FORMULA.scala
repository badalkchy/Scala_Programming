import scala.io.StdIn.readInt;
object D_2_Sum_of_given_range_FORMULA {
  def main(Args:Array[String]):Unit={
    print("Enter the number :");
    var n:Int=readInt();
    print("Enter the final number :");
    var m:Int=readInt();
    var sum:Int=(((m*(m+1))/2)+n)-((n*(n+1))/2);
    print(sum);
  }
}
