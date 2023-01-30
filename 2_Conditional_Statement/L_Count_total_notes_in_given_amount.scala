import scala.io.StdIn.readInt;
object L_Count_total_notes_in_given_amount {
  def main(args:Array[String]):Unit={
    print("Enter the number :");
    var n:Int=readInt();
    if(n>0){
      if(n>=500){
        var c:Int=n/500;
        n=(n)-(500*c);
        println("500 : "+c);
      }
      if(n>=100){
        var c:Int=n/100;
        n=(n)-(100*c);
        println("100 : "+c);
      }
      if(n>=50){
        var c:Int=n/50;
        n=(n)-(50*c);
        println("50 : "+c);
      }
      if(n>=20){
        var c:Int=n/20;
        n=n-(20*c);
        println("20 : "+c);
      }
      if(n>=10){
        var c:Int=n/10;
        n=n-(10*c);
        println("10 : "+c);
      }
      if(n>=5){
        var c:Int=n/5;
        n=n-(5*c);
        println("5 : "+c);
      }
    }
    else{
      println("Invalid");
    }
  }
}
