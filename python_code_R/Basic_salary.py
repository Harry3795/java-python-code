    #"""Wap in python input 
    #basic salary>=20,000
    #DA=60%
    #TA=50%
    #HRA=10%  other wise DA=50%
    #TA=30%
    #HRA=600 
    #Tax deducted all person has 10%  find the net salary
    #GS=BS+DA+TA+HRA= NS
    #NS=GS-Tax"""
basic_salar =int(input("Enter Basic Salary:"))
if basic_salar>=20000:
    da= basic_salar*0.60
    ta=basic_salar*0.50
    hra=basic_salar*0.10
else:
    da=basic_salar*0.50
    ta=basic_salar*0.3
    hra=600
    GS=basic_salar+da+ta+hra
    tax=basic_salar*0.1
    NS=GS-tax
print("Your Gross Salary is =",NS)