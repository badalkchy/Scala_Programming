import scala.io.StdIn.readInt;
object E_2_Compare_two_conditional_statement {
  def main(Args:Array[String]):Unit={
    print("Enter the first num :");
    var n:Int=readInt();
    print("Enter the second num :");
    var m:Int=readInt();
    if(n==m) {
      print("Both are equal");
    }
    else if(n>m){
      print(n+" is maximum");
    }
    else{
      print(m+" is maximum");
    }
  }

}
