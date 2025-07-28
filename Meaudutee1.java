// Class representing each student
 class ArrayObject1 {
    public int roll_no;
    public String name;

    // Constructor
    ArrayObject1(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}

// Main class
public class Meaudutee1 {
    public static void main(String[] args) {
        // Create an array of ArrayObject1
        ArrayObject1[] arr = new ArrayObject1[5];
        arr[0] = new ArrayObject1(1, "Alice");
        arr[1] = new ArrayObject1(2, "Bob");
        arr[2] = new ArrayObject1(3, "Charlie");
        arr[3] = new ArrayObject1(4, "David");
        arr[4] = new ArrayObject1(5, "Eve");

        // Accessing array elements
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Roll No: " + arr[i].roll_no + ", Name: " + arr[i].name);
        }
    }
}

