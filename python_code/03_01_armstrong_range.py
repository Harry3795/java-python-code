min=int(input("Enter a start range"))
max=int(input("Enter a last range"))
for n in range(min,max):
    sum=0
    l=len(str(n))
    n1=n
    while n>0:
        digit=n%10
        sum+=digit**l
        n=n//10

    if sum==n1:
        print(n1)