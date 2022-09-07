public class Main {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 6, 4, 7, 5, 8, 1, 8};
        int[] duplicate = new int[arr.length];
        int startIndex = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] % 2 == 0) {
                    if (i != j && arr[i] == arr[j]) {
                        if (!isFind(duplicate, arr[i])) {
                            duplicate[startIndex++] = arr[i];
                        }
                        break;
                    }
                }
            }
        }
        for (int result : duplicate) {
            if (result != 0) {
                System.out.println(result);
            }
        }
    }
}