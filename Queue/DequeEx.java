import java.util.*;
public class DequeEx {
    public static void main(String[] args) {
        Deque <Student> dq = new LinkedList<>();
        // dq.addFirst(4);
        // dq.addFirst(14);
        // dq.addFirst(41);
        // dq.addLast(15);
        // System.out.println(dq.peekFirst());
        // System.out.println(dq.peekLast());
        // System.out.println(dq.pollFirst());
        // System.out.println(dq.pollLast());
        // System.out.println(dq.size());
        // System.out.println(dq);

        String[] name ={"Manoj","pavan","sobhan","karthik"};
        int[] age={20,21,19,30};
        String[] flag={"yellow","a","e","c"};
        for(int i=0;i<name.length;i++){
            dq.addLast(new Student(name[i],age[i],flag[i]));
        }
        while (!dq.isEmpty()) {
            Student front= dq.pollFirst();
            System.out.println(front.name);

            if(!dq.isEmpty()){
                Student last =dq.pollLast();
                System.out.println(last.name);
            }
        }
    }
}
class Student{
    String name;
    int age;
    String flag;
    Student(String name,int age,String flag){
        this.name=name;
        this.age=age;
        this.flag=flag;
    }
}
