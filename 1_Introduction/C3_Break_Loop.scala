import scala.util.control.Breaks.breakable;
import scala.util.control.Breaks.break;
import scala.io.StdIn.readInt;
object C3_Break_Loop {
  def main(Args:Array[String]):Unit={

    print("Enter the number :");
    var n:Int=readInt;
    var c:Int=0;

    breakable {
      for (a <- 2 to n - 1) {
        if (n % a == 0) {
          c = c + 1
          print(n + " is non prime number");
          break;
        }
      }
    }
    if(c==0){
      print(n+" is prime number ");
    }
  }
}