package Practical1;

import java.util.Scanner;

public class BinarySearch {

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
		
		int result = BinarySearchImplement(arr,target);
		if(result != -1) {
			
			System.out.println("Element found at Position : "+(result+1));
		}else {
			System.out.println("Element not found");
		}
	}
	public static int BinarySearchImplement(int[] arr, int target) {
		int left = 0;
		int right = arr.length -1;
		while(left <=right) {
			int mid = left +(right -left) /2;
			
			if(arr[mid] == target) {
				return mid;
			}
			else if(arr[mid] < target) {
				left = mid +1;
			}else {
				right = mid -1;
			}
		}
		return -1;
	}
}
