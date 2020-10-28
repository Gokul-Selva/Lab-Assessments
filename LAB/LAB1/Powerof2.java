/*
* Desc: Power of 2 or not
* Author: Gokul
*/
import java.util.*;

public class Powerof2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scan.nextInt();
        boolean result = checkNumber(num);
        if (result) {
            System.out.println(num + " is power of 2");
        } else {
            System.out.println(num + " is not power of 2");
        }
        scan.close();
    }

    static boolean checkNumber(int num) {
        int flag = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                flag = 1;
            } else {
                flag = 0;
                break;
            }
            num = num / 2;
        }
        if (flag == 1) {
            return true;
        } else {
            return false;
        }
    }
}
