public class VariableSizeSW {
    public static void main(String[]args){
        int[] arr = {1,8,3,7,5,6};
        //this is fixed size sliding window

         int n =arr.length;
         int k =10;
         int temp =0;
        int ans=0;
         int l=0;
        // for (int r=0;r<n;r++){
        //     temp+=arr[r];
        //     if(r-l==k){
        //         temp-=arr[l];
        //         l++;
        //     }
        //     if(r-l+1==k){
        //         ans = Math.max(ans,temp);
        //     }

        // }
        // System.out.println(ans);


        //this is non fixed size sliding window
        
        //here the question is to findout the max of 2 people less then k i.e ans(sum of two people)<10  okka bus loo max mem vundali valla size 10 kanna thakkova vundali ex from arr (8,1) 2 mem max bus loo vuntaru <10
        for (int r=0;r<n;r++){
            temp+=arr[r];

            while(temp>k){
                temp-=arr[l];
                l++;
            }
            ans = Math.max(ans,r-l+1);
        }
        System.out.println(ans);
    }
}
