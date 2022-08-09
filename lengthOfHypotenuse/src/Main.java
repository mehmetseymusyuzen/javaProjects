import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double x , y, z, u, t;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first vertical edge : ");
        x = input.nextDouble();

        System.out.print("Enter the second vertical edge : ");
        y = input.nextDouble();

        z = Math.sqrt((x*x) + (y*y));

        u = (x + y + z) / 2;
        t = u*(u-x)*(u-y)*(u-z);

        System.out.println("The value of the hypotenuse : " + z);
        System.out.println("The value of the area of the triangle : " + Math.sqrt(t));

    }
}