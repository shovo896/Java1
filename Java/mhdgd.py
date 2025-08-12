rows=int(input('Enter the number of rows:'))
for i in range(rows):
    print(""*(rows-i),ends="")
    coef=1 
    for j in range(i+1):
        if j==0 or i ==0:
            coef=1
        else:
            coef=coef*(i-j-1)//j
        print(f"{coef:P4}",end="")
    print()

