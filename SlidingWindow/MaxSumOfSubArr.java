public class MaxSumOfSubArr {
    public static void main(String[]args){
        int[] arr={5,9,1,8,7};
        int ans=0;
        int sl=3;
        int l=0;
        int temp =0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length;j++){
        //         //System.out.println(i+" "+j);
        //         int temp=0;
        //         for(int k=i;k<=j;k++){
        //             //System.out.print(arr[k]+" ");

        //             temp +=arr[k];
        //         }
        //         ans=Math.max(temp,ans);
        //     }
        // }
        //this takes O(n**2)

        // for(int i=0;i<=arr.length-sl;i++){
        //     int j =i+sl-1;
        //     for(int k=i;k<=j;k++){
        //         temp +=arr[k];
        //     }
        //     ans=Math.max(temp,ans);
        // }

        //O(n)
        for(int r=0;r<arr.length;r++){
            temp+=arr[r];
            if(r-l==sl){
                temp-=arr[l];
                l++;
            }
            if(r-l+1==sl){
                ans=Math.max(temp,ans);
            }
        }
        System.out.println(ans);
    }
}
