# Define the class
class ArrayObj:
    def __init__(self, roll_no, name):
        self.roll_no = roll_no
        self.name = name

# Create an array (list) of objects
arr = [
    ArrayObj(1, "Cutie"),
    ArrayObj(2, "Sweetie"),
    ArrayObj(6, "Love"),
    ArrayObj(7, "Angel"),
    ArrayObj(8, "Princess"),
    ArrayObj(9, "Queen"),
    ArrayObj(11, "Star"),
    ArrayObj(12, "Dream"),
    ArrayObj(13, "Sunshine")
]

# Print all student details
for student in arr:
    print("Roll No:", student.roll_no, ", Name:", student.name)
