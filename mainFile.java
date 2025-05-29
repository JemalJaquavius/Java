public class mainFile {
  int x = 5;
  String word = "This is from mainFile";
  String test = "This is also from mainFile";
  public void aPublicMethod(){
    int y = 10;
    System.out.println(y + " is a number")
  }
  public static void main(String[] args) {
    System.out.println("This right here, is a line of text");
    Main myObj = new Main();
    myObj.aPublicMethod();
  }
}
