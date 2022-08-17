import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year value : ");
        year = input.nextInt();

        if (year % 4 == 0 && !(year % 100 == 0) || (year & 400) ==0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}