import scala.io.StdIn.readInt;
object B_1_Even_Odd {
  def main(Args:Array[String]): Unit = {
    print("Enter the number :");
    var n:Int=readInt;
    if(n%2==0){
      print("Even");
    }
    else{
      print("Odd");
    }
  }
}
