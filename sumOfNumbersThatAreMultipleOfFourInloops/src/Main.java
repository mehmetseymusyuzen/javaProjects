import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, total = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir sayi giriniz : ");
            number = input.nextInt();

            if (number % 4 == 0) {
                total += number;
            }
        } while (number % 2 == 0);
        System.out.println("The sum of the numbers satisfying the condition : " + total);
    }
}