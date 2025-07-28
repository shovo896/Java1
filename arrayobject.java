// Class name should start with uppercase by Java convention
public class ArrayObject {
    public int roll_no;
    public String name;

    // Constructor
    ArrayObject(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class Meaudutee {
    public static void main(String[] args) {
        // Create an array of ArrayObject
        ArrayObject[] arr = new ArrayObject[5];
        arr[0] = new ArrayObject(1, "Alice");
        arr[1] = new ArrayObject(2, "Bob");
        arr[2] = new ArrayObject(3, "Charlie");
        arr[3] = new ArrayObject(4, "David");
        arr[4] = new ArrayObject(5, "Eve");

        // Accessing array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Roll No: " + arr[i].roll_no + ", Name: " + arr[i].name);
        }
    }
}





}