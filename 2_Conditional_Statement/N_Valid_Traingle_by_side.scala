import scala.io.StdIn.readInt;
object N_Valid_Traingle_by_side {
  def main(args:Array[String]):Unit={
    print("Enter the 1st side :");
    var a:Int=readInt();
    print("Enter the 2nd side :");
    var b:Int=readInt();
    print("Enter the 3rd side :");
    var c:Int=readInt();
    if(a>0 && b>0 && c>0){
      if((a+b)>c || (b+c)>a || (a+c)>b){
        print("According to all side, Traingle is valid");
      }
      else{
        print("Traingle isn't valid");
      }
    }
    else{
      print("Trainle isn't valid");
    }
  }
}
