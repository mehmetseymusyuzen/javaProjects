import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temperature;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the air temperature : ");
        temperature = input.nextInt();

        if (temperature > 25) {
            System.out.println("You can swim.");
        } else if (temperature >= 5) {
            if (temperature <= 15) {
                System.out.println("You can go to cinema.");
            }
            if (temperature >= 10) {
                System.out.println("You can have a picnic.");
            }
        } else {
            System.out.println("You can ski.");
        }
    }
}