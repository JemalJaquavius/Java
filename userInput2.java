import java.util.Scanner;

class userInput2 {
  static void balance() {
    int b = 25000;
    System.out.println("Current balance is: " + b);
  }
  public static void Main(String[] args) {
    Scanner Password = new Scanner(System.in);
      System.out.println("Enter 5-digit password:");
      String passwordInput = Password.nextLine();
    
    if (passwordInput = 18725) {
      System.out.println("Correct password");
      
    } else {
      System.out.println("Incorrect password");
    }
  }
}
