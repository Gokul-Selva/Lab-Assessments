
/*
*Desc:To check whether the given string is positive or not
*Author: Gokul S
*
*/
import java.util.*;

public class PositiveString {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        boolean result = PositiveString(str);
        System.out.println(result);
    }

    private static boolean PositiveString(String str) {

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) < str.charAt(i + 1)) {
            } else
                return false;
        }
        return true;

    }

}