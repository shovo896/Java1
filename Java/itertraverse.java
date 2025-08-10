import java.util.ArrayList;
import java.util.Iterator;
public class itertraverse {
    public static void main(String[]args){
        ArrayList<String> al= new ArrayList<>();
        for(int i=0; i<10;i++){
            al.add(i);
        }
        // printing all the orginal list
        System.out.println("Original List: " + al);
        Iterator<Integer> itr = al.iterator();
        System.out.println("Iterating through the list:");
        while(itr.hasNext()){
            Integer i = itr.next();
            System.out.println(i);
            if (i % 2 != 0) {
                itr.remove(); // remove even numbers
            }
        }
        System.out.println();
        // printing al the modified list 
        System.out.println("Modified List: " + al);
         









    }
    
}
