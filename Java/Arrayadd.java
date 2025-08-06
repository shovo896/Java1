import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Arrayadd {
    public static void main(String[] args){
        List<String> l = new ArrayList<>();
        l.add("Red");
        l.add("Green");
        l.add("Blue");
        Collections.addAll(l,"Fruits", "Vegetables", "Dairy");
        for(int i =0;i<l.size();i++){
            System.out.println(l.get(i));
        }






    }
    
}
