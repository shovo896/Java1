public class doublepyra {
    public static void main(String[]args){
        int rows=5,k=0;
        for(int i = 1;i<=rows;k=0){
            for(int space=1;space<=rows;++space){
                System.out.print("");
            }
            while(k !=2*i-1){
                System.out.println("*");
                ++k;
            }
            System.out.println();
        }








    }
    
}
