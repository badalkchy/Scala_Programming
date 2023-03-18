import scala.io.StdIn.readInt;
object G_1_Leap_year_CONDITIONAL_STATEMENT {
  def main(Args:Array[String]):Unit={
    print("Enter the year :");
    var n:Int=readInt();
    if( (n%400==0) || (n%4==0 && n%100!=0) ){
      print("Leap Year");
    }
    else{
      print("Non Leap Year");
    }
  }
}
