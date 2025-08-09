// Copying elements using copy() method 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class copyy {
    public static void main(String[] args){
        List<String> l1=new ArrayList<>();
        l1.add("Red");
        l1.add("Green");
        l1.add("Blue");
        l1.add("Black");
        System.out.println("The orginal desztination is : ");
        for (int i =0;i<l1.size();i++){
            System.out.print(l1.get(i)+"");

        }
        System.out.println();
        List<String> l2=new ArrayList<>();
        l2.add("White");
        l2.add("Yellow");
        
        l2.add("Pink");
        Collections.copy(l1, l2);
        System.out.println("The destination after copying is :");
        for (int i =0;i<l1.size();i++){
            System.out.print(l1.get(i)+"");
        }
        







    }

    
}
