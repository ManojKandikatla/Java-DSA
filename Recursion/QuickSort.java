import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        //okka element ni pick chesukoni and making sure that the left of that element anni chinna elements eyy vundali right side of the elements anni greater then eyy  vundalii

        //pivot ante okka random element
        //pivot ki left starting index right ending index vuntadhi then we need to check wheather s<p && e>p condition fail aithe s and e ni swap cheyali 

        //always try to pick last element as a pivot

        int[] arr = {5,4,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
    static void sort(int[] nums,int low, int hi){
        if(low>hi){
            return;
        }
        int s = low;
        int e= hi;
        int m = s+(e-s)/2;
        int pivot = nums[m];

        while(s<=e){
            //also a reason why if its already  sorted it will not swap

            while(nums[s] < pivot){
                s++;
            }
            while (nums[e]>pivot) {
                e--;
            }
            if(s<=e){
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        //now my pivot is at correct index, please sort two halfs now
        sort(nums, low, e);
        sort(nums, s, hi);

    }
}
 