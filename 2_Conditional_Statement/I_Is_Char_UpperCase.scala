import scala.io.StdIn.readChar;
object I_Is_Char_UpperCase {
  def main(args:Array[String]):Unit={
    print("Enter the number :");
    val ch:Char=readChar();
    if(ch>='A' && ch<='Z'){
      print("Characters are in upperCase");
    }
    else if (ch>='a' && ch<='z'){
      print("Char are in lowerCase");
    }
    else{
      print("Input are not an Char");
    }
  }
}
