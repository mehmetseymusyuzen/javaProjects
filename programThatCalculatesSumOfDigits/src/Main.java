import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int temNumber = number;
        int digitsValue;
        int result = 0;

        while (temNumber != 0) {
            digitsValue = temNumber % 10;
            result += digitsValue;
            temNumber /= 10;
        }
        System.out.println("Sum of digits of the number " + number + " : " + result);
    }
}