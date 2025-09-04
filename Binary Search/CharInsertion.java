public class CharInsertion {

     public static char bs(char []arr,int target){
        int l=0;
        int r= arr.length-1;
         while (l<=r) {
            int mid =l+(r-l)/2;
            if(arr[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        if(r == -1){
            return 'a';
        }
        return arr[r]; 
    }
    public static void main(String[]args){
        /*manam target element okka lowest values loo highest element ni return cheyalii*/

        char arr[]={'c','e','g','k','y'};
         System.out.println(bs(arr,'z'));
    }
}
