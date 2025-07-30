import java.util.regex.Matcher;
import java.util.regex.Pattern;

class searching {
    public static void main(String[] args){
        Pattern p=Pattern.compile("O amar Dutee re message deu");
        Matcher m =p.matcher(" O amar Dutee re message deu");
        while(m.find())
            // print start and end index of the match of the pattern in the text 
            // using this functionality of this class 
            System.out.println("Pattern found at index:"+m.start()+"to"+(m.end()-1));






    }


    
}
