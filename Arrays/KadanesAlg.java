public class KadanesAlg {
    public static void main(String[] args) {
        int[] arr ={-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;
         long sum = 0, maxi = Long.MIN_VALUE;
         for (int i = 0; i < n; i++) {
            sum += arr[i];

            if(sum > maxi){
                maxi = sum;
            }


            if(sum <0){
                sum = 0;
            }
            if(maxi < 0){
                System.out.println("0");
                break;
            }
            
         }
         System.out.println(maxi);
    }
}
 