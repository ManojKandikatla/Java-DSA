public class RotateNtimes {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        rotate(a, -4);
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]+ " ");
        }
    }
    // static void rotateONE(int[] a){
    //     int temp =a[0];
    //      for(int i =1;i<a.length;i++){
    //         a[i-1] = a[i];
    //     }
    //     a[a.length-1] = temp;
    // }

    static void reverse(int[] a, int start, int end){
        while (start<end) {
            int temp = a[start];
            a[start] = a[end];
            a[end]= temp;
            start++;
            end--;
        }
    }

    static void rotate(int[] a, int k){
        k= k%a.length;//remainder
        if(k < 0){
            k=k+a.length;
        }
        reverse(a, 0, k-1);
        reverse(a, k, a.length-1);
        reverse(a, 0, a.length-1);
        // for (int i = 1; i <= k; i++) {
        //     // rotateONE(a);
        // }
    }
} 
//optimized to o(n)