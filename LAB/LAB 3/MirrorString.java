/*
*Desc: To give the mirror output of the given input
*Author: Gokul S
*
*/

public class MirrorString {

    public static void main(String[] args) {
        System.out.println(getImage("EARTH"));

    }

    public static String getImage(String inputString) {
        StringBuffer inputStringBuffer = new StringBuffer(inputString);
        String image = inputStringBuffer.reverse().toString();
        String resultantString = inputString + "|" + image;
        return resultantString;
    }

}