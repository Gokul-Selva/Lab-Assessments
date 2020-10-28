/*
* Desc: To find the difference between the sum of the squares and the square of the sum of the first n natural numbers
* Author: Gokul
*/
package sumofdifference;

import java.util.*;
public class Sumofdifference{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=s.nextInt();
		System.out.println(calculateDifference(n));
		s.close();
	}
	public static int calculateDifference(int n){
		int sum1=0,sum2=0;
		for(int i=1;i<=n;i++)
		{
			sum1=sum1+(int)Math.pow(i,2);
			sum2=sum2+i;
		}
		return sum1-((int)Math.pow(sum2,2));
	}
	
}
