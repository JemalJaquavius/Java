public class secondFile {
  static void staticMethod() {
    System.out.println("This is a method");
  }
  public static void main(String[] args) {
    System.out.println("This is another java file");
    Main myObj = new Main();
    myObj.x();
    System.out.println("A line of text");
    int k = 7;
    if (10 + k == 17){
      System.out.println("17 is a number");
    } else {
      System.out.println("17 is no longer a number");
    }
    myObj.word(); 
    myObj.test();
    System.out.println(k + "is a number");
    staticMethod();
    int f = 1;
    while (f <= 10) {
      System.out.println(f);
      f++;;
    }
  }
}
