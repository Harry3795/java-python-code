#include<iostream>
#include<conio.h>
class raj

{
    int d,b,c;
    public:
    raj()  //default constructor
    {

    }
    raj(int a ,int b)//parametrised constructor
    {
       
        c=a+b;
       
    }
    raj(raj &x)//copy constructor
    {
     c=x.c;
    }
    void show()
    {
      std::cout<<"output is "<<c<<std::endl;  
    }

   
};
int main()
{
   
    raj o1(5,6);
    raj o2(o1);
    o1.show();
    o2.show();
    


}
