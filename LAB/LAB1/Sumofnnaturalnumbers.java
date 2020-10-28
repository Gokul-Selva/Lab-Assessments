/*
* Desc: To calculate the sum of first n natural numbers which are divisble by 3 or 5
* Author: Gokul
*/

package sumofnnaturalnumbers;

import java.util.Scanner;
public class Sumofnnaturalnumbers{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=s.nextInt();
		System.out.println(calculateSum(n));
		s.close();
	}
	public static int calculateSum(int n){
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0||i%5==0){
				sum+=i;
			}
		}
		return sum;
	}
	
} 
