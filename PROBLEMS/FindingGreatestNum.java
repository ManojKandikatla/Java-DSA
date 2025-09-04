public class FindingGreatestNum{
    public static void main(String[] args){
        int arr[]={2,5,7,68,9,77,45,7,34,6,89,21,23};
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            // if(arr[i]>ans){
            //     ans = arr[i];
            // }
            ans = Math.max(arr[i],ans);//compaires arr[i] and ans and returns maximum one
        }
        System.out.println(ans);
    }
}