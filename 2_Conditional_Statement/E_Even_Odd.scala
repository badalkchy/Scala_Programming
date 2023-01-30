import scala.io.StdIn.readInt;
object E_Even_Odd {
  def main(args:Array[String]):Unit={
    print("Enter the number :");
    val n:Int=readInt();
    if(n%2==0){
      print("Even no.");
    }
    else{
      print("Odd no.");
    }
  }
}
