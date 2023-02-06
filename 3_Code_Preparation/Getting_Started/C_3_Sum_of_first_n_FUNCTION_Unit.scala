import scala.io.StdIn.readInt;
object C_3_Sum_of_first_n_FUNCTION_Unit {
  def Sum(n:Int):Unit={
    var sum:Int=0;
    for(a<-1 to n){
      sum=sum+a;
    }
    print(sum);
    return;
  }
  def main(Args:Array[String]): Unit = {
    print("Enter the number :");
    var n:Int=readInt();
    Sum(n);
  }
}
