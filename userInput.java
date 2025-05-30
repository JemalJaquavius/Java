import java.util.Scanner;

class userInput {
  public static void main(String[] args) {
    Scanner nameOfUser = new Scanner(System.in);
    System.out.println("enter username:");

    String username = nameofUser.nextLine();
    System.out.println("Welcome, " + username);

    Scanner Numbers = new Scanner(System.in);
    System.out.println("Enter two numbers");
    String number = Numbers.nextLine();
    Scanner Numbers2 = new Scanner(System.in);
    String number2 = Numbers2.nextLine();

    System.out.println(number + number2);
  }
}
