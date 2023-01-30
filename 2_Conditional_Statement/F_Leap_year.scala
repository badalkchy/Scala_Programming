import scala.io.StdIn.readInt;
object F_Leap_year {
  def main(args:Array[String]):Unit={
    print("Enter the number:");
    var n :Int=readInt();
    if(n%400==0 || (n%4==0 && n%100!=0)){
      print("Leap year");
    }
    else{
      print("Non Leap year");
    }
  }
}
