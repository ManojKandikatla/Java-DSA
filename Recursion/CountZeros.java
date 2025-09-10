public class CountZeros {
    public static void main(String[] args) {

        System.out.println(count(3021));
        
    }
    static int count(int n){
        return helper(n,0);//final count value is returned to main from here
    }
    private static int helper(int n, int c){
        if(n==0){
            return c;//if total n value becomes 0 return count value
        }

        int rem = n % 10;
        if(rem ==0){
            return helper(n/10, c+1);//if rem == 0 moving n value  left for 1 time and increaing count
        }
        return helper(n/10, c);

    }
}
