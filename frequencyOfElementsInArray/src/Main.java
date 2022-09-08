import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 2, 3, 4, 4, 5, 5, 5 ,6};
        int[] tempArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    tempArr[i]++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i != j) && (arr[i] == arr[j])) {
                    arr[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (tempArr[i] >= 1) {
                if (arr[i] != 0) {
                    System.out.println(arr[i] + " : " + " repeated " + tempArr[i] + " times ");
                }
            }
        }
    }
}