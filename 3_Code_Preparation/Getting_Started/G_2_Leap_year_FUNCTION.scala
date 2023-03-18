import scala.io.StdIn.readInt;
object G_2_Leap_year_FUNCTION {
  def IsLeap(n:Int):Unit={
    if( (n%400==0) || (n%4==0 && n%100!=0) ){
      print("Leap Year");
    }
    else{
      print("Non Leap Year");
    }
    return;
  }
  def main(Args:Array[String]):Unit={
    print("Enter the number :");
    var n:Int=readInt();
    IsLeap(n);
  }
}
