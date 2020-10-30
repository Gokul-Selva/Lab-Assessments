/*
*Desc: To give the mirror output of the given input
*Author: Gokul S
*
*/

import java.util.Scanner;

public class MirrorImage {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String result = getImage(str);
        System.out.println(str + "|" + result);

    }

    private static String getImage(String str) {

        StringBuilder sb = new StringBuilder(str);
        sb = sb.reverse();
        String res = sb.toString();
        return res;
    }

}