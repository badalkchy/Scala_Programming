import scala.io.StdIn.readInt;
object G_3_Leap_year_TERNARY {
  def main(Args:Array[String]):Unit={
    print("Enter the number :");
    var n:Int=readInt();
    var N:String="Non Leap Year";
    var Y:String="Leap Year";
    var res:String = if((n%400==0) || (n%4==0 && n%100!=0)) Y else N;
    print(res);
  }
}