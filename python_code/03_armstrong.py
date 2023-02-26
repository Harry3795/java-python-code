''' 
min=int(input("Enter lower number(range)"))
max=int(input("Enter upper number(range)"))
for num in range(min,max+1):
  sum=0
  temp=num
  while temp > 0:
     digit = temp % 10
     sum += digit**len(str(num))
     temp //=10
  if num==sum:
         print(sum)
       
# # st = int(input("Enter starting range ="))
# num = int(input('Enter end range = '))
# num_original =num2=num
# sum1 = 0
# cnt=0

# while(num>0):
# 	cnt=cnt+1
# 	num=num//10

# while num2>0:
#    rem = num2% 10
#    sum1 += rem ** cnt
#    num2//= 10


# if(num_original==sum1):
#     print('Armstrong!!')
# else:
#     print('Not Armstrong!')

''' 
n=int(input("Enter a Number"))
sum=0
l=len(str(n))
n1=n
while n>0:
    digit=n%10
    sum+=digit**l
    n=n//10

if sum==n1:
    print(f"{n1} is Armstrong Number") 
else:
    print(f"{n1} is not Armstrong ")      
    