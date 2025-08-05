import java.util.*;


public class TreeSet {
    public static void main(String[] args){
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("Apple");
        ts.add("Banana");
        ts.add("Cherry");
        ts.add("Date");
        ts.add("Elderberry");
        //Tranversing elements
        Iterator<String> itr=ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }







    }
    
}
