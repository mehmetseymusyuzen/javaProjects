import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int maxNumber = 0;
        int minNumber = 0;
        System.out.print("Please enter a number starting from at least 2 : ");
        int select = input.nextInt();

        if (select > 1) {
            for (int i = 1; i <= select; i++) {
                System.out.print("Enter the " + i + ". number : ");
                int n = input.nextInt();
                if (i == 1) {
                    maxNumber = n;
                    minNumber = n;
                } else {
                    if (n > maxNumber) {
                        maxNumber = n;
                    } else if (n < minNumber) {
                        minNumber = n;
                    }
                }
            }
            System.out.println("The largest number : " + maxNumber);
            System.out.println("The smallest number : " + minNumber);
        } else {
            System.out.println("Incorrect operation !");
        }
    }
}


