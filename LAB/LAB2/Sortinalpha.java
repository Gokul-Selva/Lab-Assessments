/*
* Desc: To accept the array of string objects and sort in alphabetical order
* Author: Gokul S
*/
public class Sortinalpha {

    public static void main(String[] args) {
        String[] arr = { "Naveen", "Gokul", "Aravindhan", "Dinesh", "Sam" };
        String[] res = sortStrings(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }

    static String[] sortStrings(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length / 2 + 1; i++) {
                arr[i] = arr[i].toUpperCase();
            }
            for (int i = arr.length / 2; i < arr.length; i++) {
                arr[i] = arr[i].toLowerCase();
            }
        } else {
            for (int i = arr.length / 2; i < arr.length; i++) {
                arr[i] = arr[i].toLowerCase();
            }
            for (int i = 0; i < arr.length / 2 + 1; i++) {
                arr[i] = arr[i].toUpperCase();
            }
        }

        return arr;
    }
}
