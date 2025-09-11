public class Sortedarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,9,5,6,7,8};
        System.out.println(sorted(arr, 0));
    }
    static boolean sorted(int[] arr, int index){
        //base condition
        if(index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr, index+1);//we gona check '<' condition if it is true it is gona perform recurtion if index reaches to end of arr it means it a sorted array and it returns true  
    }
}