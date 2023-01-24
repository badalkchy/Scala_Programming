import scala.io.StdIn.readInt;
object B_1_Conditional_Statement {
  def main(args:Array[String]): Unit = {
    print("Enter the number :");
    var a:Int=readInt();
    if(a%2==0){
      print("Even");
    }
    else{
      print("odd");
    }
  }
}
