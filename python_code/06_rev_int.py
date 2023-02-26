from audioop import reverse

# print(input("Enter a Number")[::-1]) # we can write in one line code
n=input("Enter a Number")
rev=n[ ::-1]
# n1=int(rev) #for interger conversion we use for calculation
# n1=n1+10    #this is addition in rev number its not mandatory
# print(n1)
print(rev)

#  Another is long method
# Number = int(input("Please Enter any Number: "))    
# Reverse = 0    
# while(Number > 0):    
#     Reminder = Number %10    
#     Reverse = (Reverse *10) + Reminder    
#     Number = Number //10    
# print("\n Reverse of entered number is = %d" %Reverse)   