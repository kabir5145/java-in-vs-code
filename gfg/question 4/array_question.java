
// Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
import java.util.Arrays;

public class array_question {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 6, 6, 5 };

        Arrays.sort(arr);
        int n = arr.length;
        int index = n - 1;
        while (arr[index] == arr[n - 1]) {
            index--;
        }
    }
}