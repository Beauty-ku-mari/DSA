public class FindDuplicates {
    public static void findDuplicates(int[] arr) {
        System.out.print("Duplicate elements: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break; // To avoid printing the same duplicate multiple times
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 6, 5};
        findDuplicates(arr); // Output: Duplicate elements: 2 5
    }
}
