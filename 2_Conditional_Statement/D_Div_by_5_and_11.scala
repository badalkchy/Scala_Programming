import scala.io.StdIn.readInt;
object D_Div_by_5_and_11 {
  def main(args:Array[String]):Unit={
    print("Enter the number :");
    val n:Int=readInt;
    if(n%5==0 && n%11==0){
      print("Yes, Input are divisible by both");
    }
    else{
      print("No, Input are'nt divisible by both");
    }
  }
}
