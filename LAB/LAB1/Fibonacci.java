/*
* Desc: Fibonacci Sequence
* Author: Gokul
*/

import java.util.*;
class Fibonacciprogram
{         
            void nonrecursive(int a,int b,int c,int n)
            {
                        for(int i=1;i<=n-2;i++)
                        {
                                    c=a+b;
                                    a=b;
                                    b=c;
                        }
                        a=b=1;
                        System.out.println("Using non recursive function is : "+c);
            }
            void  recursive(int a,int b,int c,int n)
            {          
                        if(n-2>0)
                        {
                        	c=a+b;
                                    a=b;
                                    b=c;
                                    recursive(a,b,c,n-1);
                                    return;
                        }
                        System.out.println("\nUsing recursive function is : "+c);
            }
}
class Fibonacci
{
            public static void main(String args[])
            {
                        Fibonacciprogram obj=new Fibonacciprogram();
                        int n,a=1,b=1,c=0;
                        Scanner scan=new Scanner(System.in);
                        System.out.println("\nEnter the number:  ");
                        n=scan.nextInt();
                        obj.nonrecursive(a,b,c,n);
                        obj.recursive(a,b,c,n);
                        scan.close();
            }
}
