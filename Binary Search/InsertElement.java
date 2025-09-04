public class InsertElement {
    public static int bs(int[]arr,int target){
        int l=0;
        int r= arr.length;
         while (l<=r) {
            int mid =l+(r-l)/2;
            if(arr[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
    public static void main(String[]args){
         int arr[]={1,3,5,7,9};
         System.out.println(bs(arr,0));
    }
}
