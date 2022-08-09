import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double r, pi = 3, area, perimeter, angle;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle : ");
        r = input.nextDouble();

        perimeter = 2 * pi * r;
        System.out.println("Circumference of the circle : " + perimeter);

        area = pi * (r*r);
        System.out.println("Area of the circle : " + area);

        System.out.print("Enter the measure of the central angle : ");
        angle = input.nextDouble();

        area = (pi * (r*r) * angle) / 360;
        System.out.println("Area of circle segment : " + area);


    }
}