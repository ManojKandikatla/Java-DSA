public class DigitSum {
    
    public static void main(String[] args) {
       int ans= product(1342);
       System.out.println(ans);
       
    }
    static int  product(int n){
        if(n == 0){
            return n;
        }
        return (n%10)+product(n/10);//2+4+3+1 = 10
    }
}

