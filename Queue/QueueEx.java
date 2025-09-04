import java.util.*;
public class QueueEx {
    public static void main(String[]args){
        //back nunchi insert chestham front nunchi delete chestham
        //FIFO

        Queue<String> q= new LinkedList<>();
        q.add("Manoj");//adds elements at end
        q.add("kumar");//works same like arrList but initializing the queue is different
        q.poll();//deleting element from front
        q.add("Manoj");
        System.out.println(q);
        System.out.println(q.size());//returns the total siz e of the queue
        System.out.println(q.isEmpty()); //returns true if empty
        System.out.println(q.peek());//returns(dispplays) front element
    }
}
