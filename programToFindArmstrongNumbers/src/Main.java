import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = input.nextInt();
        int temNumber = number;
        int numberOfDigits = 0;
        int digitsValue;
        int digistPow;
        int result = 0;

        while (temNumber != 0) {
            temNumber /= 10;
            numberOfDigits++;
        }

        temNumber = number;

        while (temNumber != 0) {
            digitsValue = temNumber % 10;
            digistPow = 1;
            for (int i = 1; i <= numberOfDigits; i++) {
                digistPow *= digitsValue;
            }
            result += digistPow;
            temNumber /= 10;

        }
        if (result == number) {
            System.out.println("This is an Armstrong number : " + result);
        } else {
            System.out.println("This is not an Armstrong number : " + result);
        }
    }
}
