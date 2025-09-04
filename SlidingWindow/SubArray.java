import java.util.*;
public class SubArray {
    public static void main(String[] args) {
        // int[] arr={1,3,4,5};
        // int n= arr.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         for(int k=i;k<=j;k++){
        //             System.out.print(arr[k]+" ");
        //         }       
        //         System.out.println();         
        //     }
        // }
        String arr="Manoj";
        int n= arr.length();
        ArrayList<String> s= new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                // for(int k=i;k<=j;k++){
                //     System.out.print(arr.charAt(k)+" "); 
                // }       
                // System.out.println(); 
                
                //optimized
                // System.out.println(arr.substring(i,j+1));   
                
                //using ArrayList
                String temp = arr.substring(i,j+1);
                s.add(temp);
            }
        }
        System.out.println(s);
    }
}
/*Q={1,2,3,4} 
 * Ans={1
 * 1 2
 * 123
 * 1234
 * 2
 * 23
 * 234
 * 3
 * 34
 * 4}
 * this is known as sub array
*/