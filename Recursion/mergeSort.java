//divide and conqure

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        //divide array into two parts 
        //get both parts via sorted 
        //merge the sorted paths

        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
       int[] ans = mergeSorttt(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] mergeSorttt(int[] arr){
        if(arr.length ==1){
            return arr;
            //it the element becomes one single element  then return it to the called function
        }
        int mid = arr.length/2;

        //making a copy from original arr the copy range is 0 to mid and stored in left
        int[] left =mergeSorttt(Arrays.copyOfRange(arr, 0, mid));

        //making a copy from original arr the copy range is mid to arr.length and stored in right
        int[] right =mergeSorttt(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    private static int[] merge(int[] first, int[] second){

        //taking a new array to merge 2 arrays its length is sum of two arrays length
        int[] mix = new int[first.length + second.length];

        int i =0; //for first/left array
        int j=0; //for second /rigth array
        int k=0; //for mix array to store sorted elements

        while (i< first.length && j< second.length) {
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
                //if first element is less the second element the store the first element in mix and increment the element
            }else{
                mix[k] = second[j];
                j++;
                //move j to mix and increment the j
            }
            k++; //when ever a element is added move k to add next element in white space
        }

        //it may be possable that one of the arrays is not complete the add the incomplete elements last of the mix

        //first while loop loo okka condition fail aina sare ikkadiki vasthadhi first while loop loo fail ainaa conditio ikkada kuda fail aithadhi but inkoka condition pass ainthadhi ahh pass ainaa condition loo vunna values anni mix end loo store aithai tharvathe mix ni return chestham
        while (i<first.length) {
            mix[k]=first[i];
            i++;
            k++;
        }
        while (j<second.length) {
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}