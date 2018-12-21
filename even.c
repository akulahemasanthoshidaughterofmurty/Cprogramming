#include<stdio.h>       //header file
#include<conio.h>
void main()
{
int num;        //declare a variable
clrscr();
printf("enter number");
scanf("%d",&num);
if(num%2==0)            //printf("num%2==0");
{
        printf("entered  num is a even");
}
else
{
        printf("entered num is odd");
}
getch();
}
