import java.util.Scanner;

class userInput {
  public static void main(String[] args) {
    Scanner nameOfUser = new Scanner(System.in);
    System.out.println("enter username:");

    String username = nameOfUser.nextLine();
    System.out.println("Welcome, " + username);

    Scanner Numbers = new Scanner(System.in);
    System.out.println("Enter two numbers");
    int number = Numbers.nextInt();
    Scanner Numbers2 = new Scanner(System.in);
    int number2 = Numbers2.nextInt();

    System.out.println(number + number2);
  }
}
