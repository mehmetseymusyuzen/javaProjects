import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int newArr;
        System.out.print("Enter the size of the array : ");
        newArr = input.nextInt();
        int[] arr = new int[newArr];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + ". number : ");
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}