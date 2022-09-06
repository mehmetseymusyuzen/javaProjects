import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 24, -32, 54};
        int min = arr[0];
        int max = arr[0];

        System.out.println(Arrays.toString(arr));
        System.out.print("Enter a number : ");
        int input = scan.nextInt();

        Arrays.sort(arr);
        for (int i : arr) {
            if (i < input) {
                min = i;
            }
            if (i > input) {
                max = i;
                break;
            }
        }
        System.out.println("The nearest number smaller than the entered number : " + min);
        System.out.println("The nearest number greater than the entered number : " + max);
    }
}