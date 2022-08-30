import java.util.Scanner;

public class Main {

    static void model(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            model(n - 5);
        }
        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = input.nextInt();

        if (n > 0) {
            model(n);
        } else
            System.out.println("You entered the wrong number");
    }
}