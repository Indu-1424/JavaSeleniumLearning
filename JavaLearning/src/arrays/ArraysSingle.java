package arrays;

import java.util.Scanner;

public class ArraysSingle {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		int arr[]=new int[4];
		System.out.println("Enter the list of elements in array: ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.nextInt();
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}

	}

}
