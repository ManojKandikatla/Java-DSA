public class SubStrings {
    public static void main(String[] args) {
        printSubStrings("abcd");
    }
    static void printSubStrings(String input){
        int n = input.length();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                System.out.println(input.substring(i, j));
            }
        }
    }
}
 