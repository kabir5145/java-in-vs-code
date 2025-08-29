// Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
import java.util.Arrays;

public class array_question {
    public static int secondLargest(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int index = n-1;
        while(arr[index]==arr[n-1]){
            index--;
            if(index<0){
                return -1;
            }
        }
        return arr[index];
    }
}