import scala.io.StdIn.readInt;
object C_Positive_Negative{
  def main(args:Array[String]): Unit = {
    print("Enter the number :");
    val n:Int=readInt();
    if(n==0){
      print("Zero");
    }
    else if(n>0){
      print("Positive");
    }
    else{
      print("Negative");
    }
  }
}