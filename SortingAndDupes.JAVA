package sorting;

import java.util.Arrays;
import java.util.Scanner;  

public class SortingAndDupes {
	
	public static void main(String[] args) {
		
		int counter, tmp;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		counter = scanner.nextInt();
		
		int arr[] = new int[counter];
		System.out.println("Enter the elements:");
		
		for(int i = 0; i < counter; i++) {
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		
		for(int i = 0; i < counter; i++) {
			for(int j = i + 1; j < counter; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.print("Sorted Array: ");
		for(int i = 0; i < counter - 1; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.print(arr[counter - 1]);
	}
}
