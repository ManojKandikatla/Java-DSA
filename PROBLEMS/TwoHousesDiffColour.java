public class TwoHousesDiffColour{
    public static void main(String[]args){
        int[] colors={1,1,1,6,1,1,1};
        int n=colors.length;
        int max = 0;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(colors[i]!=colors[j]){
        //             int deff= j-i;
        //             max=Math.max(max,deff);
        //         }
        //     }
        // }
        //this is O(n**2)

        //Optimized code to (O(n))
         for(int i=0;i<n;i++){
            if(colors[i]!=colors[n-1]){
                max= Math.max(max,n-1-i);
                break;
            }
         }
         for(int i=n-1;i>=0;i--){
            if(colors[i]!=colors[0]){
                 max= Math.max(max,i-0);
                 break;
            }
         }
        System.out.println(max);
    }
} 