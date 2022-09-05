public class Main {
    public static void main(String[] args) {

        double harmonicAverage = 0;
        double[] list = {3, 5, 7, 9};

        for (double i : list) {
            harmonicAverage += (1 / i);
        }

        harmonicAverage = list.length / harmonicAverage;

        System.out.println("Harmonic average of the numbers in the array : " + (harmonicAverage));
    }
}