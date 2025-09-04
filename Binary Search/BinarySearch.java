public class BinarySearch {
    public static void main(String[]args){
        int arr[]={1,4,6,8,10};
        int target =10;
        int ans=-1;
        int l=0;
        int r=arr.length-1;
        while (l<=r) {
            int mid =l+(r-l)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
            }
            else if(arr[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        System.out.println(ans);
    }
}
