package Assignment2;

import java.util.Scanner;

public class ArrayElement {
    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 3, 2, 0, 9, 8, 3};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find frequency: ");
        int target = sc.nextInt();
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        System.out.println("Number " + target + " appears " + count + " times in the array.");
    }
}
