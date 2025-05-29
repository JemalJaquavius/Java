import java.util.Scanner;

class userInput {
  public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
    System.out.println("enter username:");

    String username = Input.nextLine();
    System.out.println("Username is " + username);
  }
}
