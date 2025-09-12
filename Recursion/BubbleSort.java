import java.util.Arrays;
//bubble sort it replaces two values linearly
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        bubble(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));  // Output: [1, 2, 3, 4]
    }

    static void bubble(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                // swap
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bubble(arr, r, c + 1);
        } else {
            // Reset c to 0 for next pass
            bubble(arr, r - 1, 0);
        }
    }
}
