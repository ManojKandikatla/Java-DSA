public class ReplaceWithGreatestElmt{
    public static void main(String[]args){
        int[] arr = {17,18,5,4,6,1};
        int n = arr.length;
        int rightnum =-1;
        // for(int i=0;i<n;i++){
        //     int rightnum=-1;
        //     for(int j=i+1;j<n;j++){
        //         rightnum = Math.max(arr[j],rightnum);
        //     }
        //     arr[i]=rightnum;
        // }

        //Optimized code O(n)
        for(int i=n-1;i>=0;i--){
            int prev=arr[i];
            arr[i]=rightnum;
            rightnum=Math.max(rightnum,prev);
        }
        System.out.println(arr);
    }
}