
/*
*Desc: To display the given input and find the sum of integers.
*Author: Gokul S
*
*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class Sumofintegers {

    public static void main(String[] args) {
        System.out.print("Enter the numbers with sapce: ");
        Scanner in = new Scanner(System.in);
        String integerLine = in.nextLine();
        sumanddisplay(integerLine);
    }

    public static void sumanddisplay(String integerLine) {
        StringTokenizer st = new StringTokenizer(integerLine, " ");
        int sum = 0;
        System.out.print("Given input: ");
        while (st.hasMoreTokens()) {
            int integer = Integer.parseInt(st.nextToken());
            System.out.print(integer + " ");
            sum += integer;
        }
        System.out.println("\nSum of the integers: " + sum);
    }

}