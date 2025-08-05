import java.util.*;

public class Deque {  
    public static void main(String[] args){
        ArrayDeque<Integer> de_que = new ArrayDeque<Integer>(10);
        // add method to start 
        de_que.add(1);
        de_que.add(20);
        de_que.add(3);
        de_que.add(4);
        de_que.add(5);
        System.out.println("Deque: " + de_que);
        // clear the method
        de_que.clear();
        // add the first()method to insert the element at the front 
        de_que.addFirst(10);
        de_que.addFirst(20);
        de_que.addFirst(30);
        de_que.addLast(24);
        de_que.addLast(25);
        System.out.println("Deque after adding elements at front and back: " + de_que);
     







    }
    
}
