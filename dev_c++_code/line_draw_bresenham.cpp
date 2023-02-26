#include<stdio.h>
// #include<conio.h>
// #include <iostream>
#include <graphics.h>
int main()
// int main(int argc,char const *argv[])
{
    // int gd=DETECT,gm;
    // initgraph(&gd,&gm,(char*)"");
    // circle(300,300,50);
    // getch();
    // closegraph();
    // return 0;
    
    int x,y,x1,x2,y1,y2,dx,dy,p,i;
    int gd=DETECT,gm;
    printf("Enter first Point :");
    scanf("%d%d",&x1,&x2);
    printf("Enter second Point :");
    scanf("%d%d",&y1,&y2);
    initgraph(&gd,&gm,(char*)"");
    dx=x2-x1;
    dy=y2-y1;
    p=2*dy-dx;
    x=x1;
    y=y1;
    i=0;
    while(i<=dx){
    putpixel(x,y,WHITE);
    if(p<0)
    {
        x=x+1;
        p=p+2*dy;
    }
    else
    {
        x=x+1;
        y=y+1;
        p=p+2*dy-2*dx;
    }
    i++
    }
    getch();
    closegraph();
    return 0;

}

