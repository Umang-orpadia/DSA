package Practical2;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortDemo {

    // Separate Insertion Sort function
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements that are greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            // Insert key at its correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Accept number of elements from the user
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // 2. Accept array elements from the user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("\nOriginal Array: " + Arrays.toString(arr));

        // 3. Perform sorting
        insertionSort(arr);

        // 4. Display sorted array
        System.out.println("Sorted Array (Insertion Sort): " + Arrays.toString(arr));

        scanner.close();
    }
}