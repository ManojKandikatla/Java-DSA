/*Array objects are stored in heap
 * heap objects are not continous
 * arrays uses dynamic memory allocation(memory is stored while runtime)
 */


public class Arrays{
    public static void main(String[]args){
        int arr[] = {1,3,5,67,8,9,1,4,61,4,7,2,3,4,5,6,91,1,1};
        int count =0;
        // for(int i=0;i<arr.length;i++){
            // if(arr[i]==1){
                // count++;
            // }
        // }
        for(int i=0;i<arr.length;i++){
            int temp = arr[i];
            int values;
            if(temp % 2 == 0 || temp % 3 == 0){
                count++;
                values = temp;
                System.out.println("the values are "+values);
            }
        }
        System.out.println("Total "+count);
    }
}