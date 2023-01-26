import scala.io.StdIn.readInt;
object D_3_Function_Boolean {
  def IsEven(n:Int):Boolean={
    if(n%2==0){
      return true;
    }
    return false;
  }
  def main(Args:Array[String]):Unit={
    print("Enter the number :");
    var n:Int=readInt;
    if(IsEven(n)){
      print("Even");
    }
    else{
      print("Odd");
    }
  }
}
