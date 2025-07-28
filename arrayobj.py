class arrayobj:
    def __init__(self,roll_no,name):
        self.roll_no=roll_no
        self.name=name

# creating an array of objects
arr=[
    arrayobj(1,"Cutie"),
    arrayobj(2,"Sweetie"),
    
   
    arrayobj(6,"Love"),
    arrayobj(7,"Angel"),
    arrayobj(8,"Princess"),
    arrayobj(9,"Queen"),
    
    arrayobj(11,"Star"),
    arrayobj(12,"Dream"),
    arrayobj(13,"Sunshine")







]
for student in arr:
    print("Roll No:", student.roll_no, "Name:", student.name)