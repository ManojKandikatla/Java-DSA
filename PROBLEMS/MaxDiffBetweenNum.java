public class MaxDiffBetweenNum{
    public static void main(String[]args){
        int[] num={7,2,1,5,4};
        int n=num.length;
        int max = -1;
        int leftmin=num[0];
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n-1;j++){
        //         int a =num[i];
        //         int b =num[j];
        //         if(a<b){
        //             int temp = b-a;
        //             max=Math.max(temp,max);
        //         }
        //     }
        // }
        // System.out.println(max);
        //this is O(n**2)


        //Optimized solution to O(n)
        for(int i=0;i<n;i++){
            int a =num[i];
            if(leftmin<a){
                max=Math.max(max,a-leftmin);
            }
            leftmin=Math.min(leftmin,a);
        }
        System.out.println(max);
    }
}