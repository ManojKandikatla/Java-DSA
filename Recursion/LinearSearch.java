import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,7,8,9,19};
        int target = 7;
        // System.out.println(find(arr, target, 0));
        // System.out.println(findIndex(arr, target, 0));
        System.out.println(findAllIndex2(arr, target,0));
    }

    // returns boolean
    // static boolean find(int[] arr, int target, int index){
    //     //base code
    //     if(index == arr.length){
    //         return false;
    //     }
    //     return arr[index]==target || find(arr, target, index+1);
    // }

    //returns index
    //  static int findIndex(int[] arr, int target, int index){
    //     //base code
    //     if(index == arr.length){
    //         return -1;
    //     }
    //     if(arr[index]==target ){
    //         return index;
    //     }
    //     else{
    //         return findIndex(arr, target, index+1);
    //     }
    // }

    //return the list without passing the arrguments

    //it will return the final  integer answer in the form of arraylist
    static ArrayList <Integer> findAllIndex2 (int[] arr,int target,int index)  
    {
        //list is initialized to store the integers inthe form of array list
        ArrayList <Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        //this will contain answer for that function call only
        if(arr[index]==target ){
            list.add(index);
        }
        //list return chesthunna vallues anni ansFromBellowCalls loo store chesukuntunam 
        ArrayList <Integer> ansFromBellowCalls = findAllIndex2(arr, target, index+1);

        //ansFromBellowCalls loo vunna nvalues anni manam lis loki add chesthunam chesi return chesthunam ahh return values main ki poyi print avvuthai
        list.addAll(ansFromBellowCalls);
        return list;
    }
}
 