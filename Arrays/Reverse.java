import java.util.Arrays;
public class Reverse{
    public static void main(String[] args){
        // String s= "raraaaa";
        // String ans ="";
        // for(int i=s.length()-1;i>=0;i--){
        //     ans =ans + s.charAt(i);
        // }
        // System.out.print(ans);

        int[] arr = {1,2,23,8,43};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start =0;
        int end = arr.length-1;

        while (start<end) {
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(arr);
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}