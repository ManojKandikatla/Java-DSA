public class MaxProfit{
    public static void main(String[] args){
        int[] arr ={7,1,4,5,3,6,2,10};
        int value = arr.length;
        int profit=0;
        int low =arr[0];
        //optimized to O(n)
        for(int i=1;i<value;i++){
            int temp = arr[i]-low;
            profit = Math.max(temp,profit);
            if(arr[i]<low){
                low =arr[i];
            }
        }
        // for(int i=0;i<value-1;i++){
        //     for(int j=i+1;j<value;j++){
        //         int temp = arr[j]-arr[i];
        //         profit = Math.max(temp,profit);
        //         //System.out.println(i+ " "+j);
        //     }
        // }
        System.out.println(profit);
    }
}