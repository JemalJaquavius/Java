import java.util.Scanner;

class userInput2 {
  public static void main(String[] args) {
    Scanner Password = new Scanner(System.in);
      System.out.println("Enter 5-digit password:");
      String passwordInput = Password.nextInt();
    
    if (passwordInput == 1875) {
      System.out.println("Correct password");
    } else {
      System.out.println("Incorrect password");
    }
    }
  }
