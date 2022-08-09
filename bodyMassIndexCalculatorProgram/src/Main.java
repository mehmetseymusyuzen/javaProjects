import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kg, m, boddMassIndex;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your weight: ");
        kg = input.nextDouble();

        System.out.print("Please enter your height in meters : ");
        m = input.nextDouble();

        boddMassIndex = kg / (m * m);
        System.out.println("Your body mass index : " + boddMassIndex);


    }
}