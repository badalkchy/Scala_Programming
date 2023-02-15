import scala.io.StdIn.readInt;
object D_1_Sum_of_n_given_range{
  def main(Args:Array[String]):Unit={
    print("Enter the initial number :");
    var n:Int=readInt();
    print("Enter the final number :");
    var m:Int=readInt();
    var sum:Int=0;
    for(a<-n to m){
      sum=sum+a;
    }
    print(sum);
  }
}