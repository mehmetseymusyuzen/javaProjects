import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, n = 0;
        double total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("enter a number : ");
        number = input.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 12 == 0) {
                System.out.println(i);
                total += i;
                n++;
            }
        }
        System.out.println("Average of numbers : " + total / n);
    }
}