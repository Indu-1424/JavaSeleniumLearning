package arrays;

import java.util.Scanner;

public class ArrayTwoDimen {

	public static void main(String[] args) {
		
		int arr[][]=new int[3][4];
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the array elements");
		
		for(int a=0;a<3;a++) {
			for(int b=0;b<4;b++) {
				arr[a][b]= input.nextInt();
			}
		}
		
		
		//int arr[][]= {{1,6,7,9},{3,2,4,7},{2,8,5,3}};
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	

	}

}
