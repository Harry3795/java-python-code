from turtle import color
import numpy as np
import matplotlib.pyplot as plt
x=['9th class filled']
y=['9th class remaining']
# h=[100,100]
# x = np.arange(0, 5, 0.1)
# y = np.sin(x)
# plt.plot(x, y)
plt.bar(x,height=70,color="red",width=0.5)
plt.bar(y,height=30,color="green",width=0.5)
# y=[50,60,90]
# plt.plot(x,y)
plt.xlabel('class 9th details')
plt.ylabel('student addimission')
plt.title('student addmission 9th and 10th class')
plt.show()