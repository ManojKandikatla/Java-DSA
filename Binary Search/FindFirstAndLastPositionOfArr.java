public class FindFirstAndLastPositionOfArr {

    public static int LeftMost(int arr[],int target){
        
        int l=0;
        int r=arr.length-1;
        while (l<=r) {
            int m=l+(r-l)/2;
            if(arr[m]>=target){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        if(l>=arr.length){
            return -1;
        }
        if(arr[l]!= target){
            return -1;
        }
        
        return l;
    }
    public static int RightMost(int[]arr,int target){
         int l=0;
        int r=arr.length-1;
        while (l<=r) {
            int m=l+(r-l)/2;
            if(arr[m]>target){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        if(r<0){
            return -1;
        }
        if(arr[r]!=target){
            return -1;
        }
        return r;
    }

     public static void main (String[]args){
         int arr[]={1,3,5,7,7,8,8,9,10};
         System.out.println(LeftMost(arr,7));
         System.out.println(RightMost(arr,8));
     }
}