import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age, flight;
        double km, perKm = 0.1, firstTypeDiscount, secondTypeDiscount, thirdTypeDiscount, fourthTypeDiscount;

        Scanner input = new Scanner(System.in);

        System.out.print("How Many Kilometers Will Your Flight Travel Be ? : ");
        km = input.nextDouble();

        double normalPrice = km * perKm;
        firstTypeDiscount = 0.5;
        secondTypeDiscount = 0.9;
        thirdTypeDiscount = 0.7;
        fourthTypeDiscount = 0.8;

        System.out.print("Will your flight be one-way (1) or round-trip (2) ? : ");
        flight = input.nextInt();

        System.out.print("How old are you ? : ");
        age = input.nextInt();

        if (flight == 2 && km > 0 && age > 0) {
            if (age < 12) {
                System.out.println("Your Ticket Price : " + normalPrice * firstTypeDiscount * fourthTypeDiscount);
            } else if (age >= 12 && age <= 24) {
                System.out.println("Your Ticket Price : " + normalPrice * secondTypeDiscount * fourthTypeDiscount);
            } else if (age > 24 && age < 65) {
                System.out.println("Your Ticket Price : " + normalPrice * fourthTypeDiscount);
            } else if (age > 65) {
                System.out.println("Your Ticket Price : " + normalPrice * thirdTypeDiscount * fourthTypeDiscount);
            }
        } else if (flight == 1 && km > 0 && age > 0) {
            if (age < 12) {
                System.out.println("Your Ticket Price : " + normalPrice * firstTypeDiscount);
            } else if (age >= 12 && age <= 24) {
                System.out.println("Your Ticket Price : " + normalPrice * secondTypeDiscount);
            } else if (age > 24 && age < 65) {
                System.out.println("Your Ticket Price : " + normalPrice);
            } else if (age > 65) {
                System.out.println("Your Ticket Price : " + normalPrice * thirdTypeDiscount);
            }
        } else {
            System.out.println("You entered incomplete or incorrect information, please try again !");
        }
    }
}
