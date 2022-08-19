import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // C(n,r) = n! / (r! * (n-r)!)
        int n, r, result, totalN = 1, totalR = 1, difference = 1;
        boolean isFalse = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number  : ");
        n = input.nextInt();

        System.out.print("Enter the second number : ");
        r = input.nextInt();

        if (n >= r && n >= 0 && r >= 0) {

            for (int i = 1; i <= n; i++) {
                totalN = totalN * i;
            }
            for (int j = 1; j <= r; j++) {
                totalR = totalR * j;
            }

            for (int k = 1; k <= (n - r); k++) {
                difference = difference * k;
            }

        } else {
            isFalse = true;
        }

        result = totalN / (totalR * difference);

        if (isFalse) {
            System.out.println("You entered incorrect information !");
        } else {
            System.out.println("Factorial of the 1st number : " + totalN);
            System.out.println("Factorial of the 2nd number : " + totalR);
            System.out.println("Result of the combination : " + result);
        }
    }
}