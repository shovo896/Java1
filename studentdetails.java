import java.util.Scanner;
class students{
    int rollno;
    String name;
    int[] marks = new int[5];
}
public class studentdetails{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        students s = new students();
        
        System.out.print("Enter roll number: ");
        s.rollno = sc.nextInt();
        sc.nextLine(); // Consume newline
        
        System.out.print("Enter name: ");
        s.name = sc.nextLine();
        
        System.out.println("Enter marks for 5 subjects:");
        for(int i = 0; i < 5; i++) {
            System.out.print("Marks for subject " + (i + 1) + ": ");
            s.marks[i] = sc.nextInt();
        }
        
        System.out.println("\nStudent Details:");
        System.out.println("Roll Number: " + s.rollno);
        System.out.println("Name: " + s.name);
        System.out.print("Marks: ");
        for(int mark : s.marks) {
            System.out.print(mark + " ");
        }
    }














}
