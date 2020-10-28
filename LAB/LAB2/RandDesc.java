
/*
* Desc: To remove the duplicates and result the array in descending order
* Author: Gokul s
*
*/
import java.util.Arrays;

public class RandDesc {

    public static int modifyArray(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 70, 30, 90, 20, 20, 30, 40, 70, 50 };
        Arrays.sort(arr);
        int length = arr.length;
        length = modifyArray(arr, length);
        int[] b = new int[length];
        int j = length;
        for (int i = 0; i < length; i++) {
            b[j - 1] = arr[i];
            j = j - 1;
        }
        for (int i = 0; i < length; i++)
            System.out.print(b[i] + " ");
    }
}