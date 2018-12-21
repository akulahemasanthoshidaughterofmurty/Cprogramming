#include<stdio.h>        //header file
#include<conio.h>
void main()
{
int num1,num2;        //declare two variables
clrscr();
printf("enter number 1");
scanf("%d",&num1);
printf("enter number 2");
scanf("%d",&num2);
                     //printf("num1>num2);
if(num1>num2)
{
  printf("num1 is greater:");
}
else
{
  printf("num2 is greater:");
  getch();
}
