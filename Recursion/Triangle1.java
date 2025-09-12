

import java.util.Arrays;

public class Triangle1 {
    public static void main(String[] args) {
       // triangle(4, 0);
        int[] arr = {4,3,2,1};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
        
    }
    static void triangle(int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            triangle(r, c+1);
            System.out.print("* ");
        }else{
            triangle(r-1, 0);
            System.out.println();
        }
    }
    
    static void bubble(int[] arr,int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){

            if(arr[c] > arr[c+1]){
                //swap
                int temp= arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr, r, c+1);
        }else{
         bubble(arr, r-1, 0);
        }
    }
}