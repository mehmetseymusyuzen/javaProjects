import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String animal = "";
        int year, zodiac;
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your year of birth : ");
        year = input.nextInt();

        zodiac = year % 12;

        switch (zodiac) {
            case 0:
                animal = "Monkey";
                break;
            case 1:
                animal = "Cockerel";
                break;
            case 2:
                animal = "Dog";
                break;
            case 3:
                animal = "Pig";
                break;
            case 4:
                animal = "Mouse";
                break;
            case 5:
                animal = "Bull";
                break;
            case 6:
                animal = "Tiger";
                break;
            case 7:
                animal = "Rabbit";
                break;
            case 8:
                animal = "Dragon";
                break;
            case 9:
                animal = "Snake";
                break;
            case 10:
                animal = "Horse";
                break;
            case 11:
                animal = "Sheep";
                break;
            default:
                isError = true;
        }
        if (isError) {
            System.out.println("You entered incorrect information !");
        } else {
            System.out.println("Your Chinese Zodiac Sign : " + animal);
        }
    }
}