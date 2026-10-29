package Practical1;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		System.out.println("Umang 153");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of Elements : ");
		int noOfElements = scanner.nextInt();
		int[] arr = new int[noOfElements];
		System.out.println("Enter elements of array :");

		for(int i =0 ;i<noOfElements;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("Enter target to be found : ");
		int target = scanner.nextInt();
		scanner.close();

		int indexOfTarget = LinearSearching(arr,target);
		if(indexOfTarget != -1) {			
			System.out.println("Target found at Position : "+(indexOfTarget+1));
		}
		else {
			System.out.println("Element not found ");
		}
	}
	public static int LinearSearching(int[] arr, int target) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
