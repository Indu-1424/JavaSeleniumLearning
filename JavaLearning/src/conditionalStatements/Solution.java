package conditionalStatements;

import java.util.Scanner;

class Result{
	public static void fizzBuzz(int n) {
	    
	    for(int i=1;i<=n;i++){
	        
	        if(i%3==0 &&i%5==0){
	            System.out.println("FizzBuzz");
	            
	        }else if(i%3==0 && i%5!=0){
	            System.out.println("Fizz");
	            
	        }else if(i%3!=0 && i%5==0){
	            System.out.println("Buzz");
	            
	        }else if(i%3!=0 && i%5!=0){
	            System.out.println(i);
	           
	        }
	    }

	    }
}

public class Solution {

	public static void main(String[] args) {
		 Scanner input= new Scanner(System.in);
	        
	        System.out.println("Enter any number");
	        
	        int n = input.nextInt();
	        
	        Result result = new Result();
	        result.fizzBuzz(n);

	}

}
