import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};  // Use curly braces {} to initialize the array
        int i = 0, j = arr.length - 1, temp;

        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));  // Use Arrays.toString to print the array
    }
}
