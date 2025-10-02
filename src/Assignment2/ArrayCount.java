package Assignment2;

public class ArrayCount {
    public static void main(String[] args) {
        int[] arr = {5, -3, 0, 7, -1, 0, 8, -6};
        int positive = 0, negative = 0, zero = 0;

        for (int num : arr) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeroes: " + zero);
    }
}


