public class FibonacciNumbers {
    public static void main(String[] args) {
        int ans = fibo(4);
        System.out.println(ans);
        
    }
    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
//sum of last two digits untill 0 
//break it down into smaller problems
//base condition is represented by answers we already have ex: we know f(0) =0;f(1)=1

//note: this is the tail recurtion return fibo(n-1) + fibo(n-2); i.e last statement of function


//to improve logic in recursion 
//1. identify if you can breakdown the problems into smaller problems
//2. write the recursive relation if needed
//3. draw the recursive tree

//about tree
//1.see flow of funtions and how they are getting into the function
//2.identify & focues on left tree calls and write tree calls
//3. see how the values are returend at each step
//4.see where the funtion  call is comming  out, in the end you will come out of the main function 
