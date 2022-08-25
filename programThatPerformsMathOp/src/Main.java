import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number n1 : ");
        int n1 = input.nextInt();
        System.out.print("Enter the number n2 : ");
        int n2 = input.nextInt();
        int i = n1;
        int ebob = 1;
        int ekok = 1;

        while (i >= 1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
                System.out.println("Greatest common divisor of two numbers : " + ebob);
                break;
            }
            i--;
        }
        while (i <= (n1 * n2)) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok = i;
                System.out.println("Least common multiple of two numbers : " + ekok);
                break;
            }
            i++;
        }
    }
}