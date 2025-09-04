import java.util.Arrays;
public class PassingIntoFunctions {
    public static void main(String[] args) {

        int[] arr = {3,5,4,13};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr){
        arr[0] = 90;
    }
}
