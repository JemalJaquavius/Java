import java.util.Scanner;

class userInput2 {
  public static void Main(String[] args) {
    Scanner Password = new Scanner(System.in);
      System.out.println("Enter 5-digit password:");
      String passwordInput = Password.nextLine();
    
    if (passwordInput == 18725) {
      String correctPassword = """ 
        Correct password.

        Currenct balance is: 25000
        """;
      System.out.println(correctPassword);
    } else {
      System.out.println("Incorrect password");
    }
  }
}
