import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        number = input.nextInt();

        for (int i = 1; i < number; i *= 4) {
            System.out.println("Numbers that are multiples of 4 : " + i);
        }

        System.out.println("-------------------------------------------");

        for (int j = 1; j < number; j *= 5) {
            System.out.println("Numbers that are multiples of 5 : " + j);
        }
    }
}