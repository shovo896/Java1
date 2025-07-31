 class Empoyee1 {
    //private fields 
    private int id ;
    private String name;
    // setters method 
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    // getters method
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    
}
public class Main {
    public static void main(String[] args) {
        Empoyee1 emp = new Empoyee1();
        emp.setId(101);
        emp.setName("Dutee");
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
    }








}
