import scala.io.StdIn.readInt;
object C_1_Sum_of_first_n {
  def main(Args:Array[String]): Unit = {
    print("Enter the number :");
    val n:Int=readInt();
    var sum:Int=0;
    for(a<-1 to n){
      sum=sum+a;
      print("+"+a);
    }
    print(" = "+sum);
  }
}
