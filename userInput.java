import java.util.Scanner;

class userInput {
    public static void(String[] args) {
    Scanner nameOfUser = new Scanner(System.in);
    System.out.println("enter username:");

    String username = nameOfUser.nextLine();
    System.out.println("Welcome, " + username);

    Scanner Numbers = new Scanner(System.in);
    System.out.println("Enter two numbers");
    int number = Numbers.nextInt();
    int number2 = Numbers.nextInt();

    System.out.println(number + number2);
    }
}
