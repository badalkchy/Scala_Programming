import scala.io.StdIn.readInt;
object A_1_Positive_Negative {
  def main(Args:Array[String]): Unit = {
    print("Enter the number :");
    var n:Int=readInt();
    if(n>0){
      print("Positive");
    }
    else{
      print("Negative");
    }
  }
}
