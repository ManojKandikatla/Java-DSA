import java.util.Arrays;
import java.util.Collections;
public class BubbleSort{
    public static void main (String[] args){
       Integer[]arr = {54,7,1,35,88,5,32,78,0};
       int n = arr.length;
        Arrays.sort(arr);//O(n log n)
        Arrays.sort(arr,Collections.reverseOrder());

        // for(int i =0;i<n-1;i++){
        //     boolean swapped =false;
        //     for(int j=0;j<n-i-1;j++){
        //         if(arr[j]<arr[j+1]){
        //             int temp =arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]=temp;
        //             swapped =true;
        //         }
        //     }
        //     if(swapped == false){
        //         break;
        //     }
        // }
        
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}