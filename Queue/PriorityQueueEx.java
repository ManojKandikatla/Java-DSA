import java.util.*;
public class PriorityQueueEx {
    public static void main(String[] args) {
        //O(log(n))
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(15);
        pq.add(50);
        // System.out.println(pq.peek());//shows smallest elemrnt
        // System.out.println(pq.poll());//smallest element deletes
        int[] toBeAdded={3,1,8};
        for(int i=0;i<toBeAdded.length;i++){
            pq.add(toBeAdded[i]);
            System.out.println("Removed: "+pq.poll());
        }
    }
}
