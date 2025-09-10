public class NumberEx {
    public static void main(String[] args) {
        //write a function that takes in a number and prints it
        //print first 5 numbers 1 2 3 4 5
        print(1);
    }
    static void print(int n){
        if(n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n + 1);
    }
}
//the function that calls itself is called recursion
//functions are stored in stack
//why recursion: it helps us to solve bigger and complex problems in a simple why
//you can convert recursion solutions into iteration and vise versa
//space complexity is not constant because of recursive calls
//it helps us in breacking down bigger problems into smaller problems