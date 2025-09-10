public class ProductOfNto1 {
    public static void main(String[] args) {
       int ans= product(5);
       System.out.println(ans);
       
    }
    static int  product(int n){
        if(n <= 1){
            return n;
        }
        return n * product(n-1);
    }
    
}
