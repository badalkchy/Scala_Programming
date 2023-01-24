import scala.io.StdIn.readInt;
object B_3_Bitwise {
  def main(Args:Array[String]):Unit={
    print("Enter the number :");
    var n:Int=readInt;
    if((n & 0)==0){
      print("odd");
    }
    else{
      print("Even");
    }
  }
}
