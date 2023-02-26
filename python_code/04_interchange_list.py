
a=[]
n= int(input("Enter the number of elements in list:"))
for x in range(0,n):
    element=int(input("Enter element" + str(x+1) + ":"))
    a.append(element)
    print(a)
temp=a[0]
a[0]=a[n-1]
a[n-1]=temp

print("New list ''is:")
print(a)
'''
list=["harry","pradeep","raj","vihal","mummy","Ram"]
list[0],list[5]=list[5],list[0]
print(list)
'''