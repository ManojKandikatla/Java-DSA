import java.util.*;
public class SetMismatch{
    public static void main(String[] args){

        int[] arr ={1,2,2,4};
        int dupicate =0;
        HashSet <Integer> hs=new HashSet <>();
        for(int i=0;i<arr.length;i++){
            //int val= arr[i];
            if(!hs.contains(arr[i])){
                hs.add(arr[i]);
            }
            else{
                dupicate = arr[i];
            }
        }
        int missing=0;
        for(int j=0;j<=arr.length;j++){
            if(!hs.contains(j)){
                missing = j;
            }
        }
        System.out.println(dupicate+" "+missing);
    }
}