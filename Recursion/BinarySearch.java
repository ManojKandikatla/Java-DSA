import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7,  45, 52, 77};
        Arrays.sort(arr);  
        int target = 4;
        int ans = search(arr, target, 0, arr.length-1);
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int s, int e) {
        if(s>e){
            return -1;
        }
        int m = s + (e - s) / 2;

        if (arr[m] == target) {
            return m;
        }
        if (target < arr[m]) {
            return search(arr, target, s, m - 1);
        }
        return search(arr, target, m + 1, e);
    
    }
}

//make sure the return of the result of a funtion call of the return type
//if return type is int make sure to return it
