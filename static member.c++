#include<iostream>
using namespace std;
class number							//class name
{
static int c;							//it works till the end of programme			
public:
void count()							//function name with no return values and no arguments
{
c++;
}
};
int number ::c=0;					//static variables are intialized to zero
int main()								//main function
{
number a,b,c;
a.count();
b.count();
c.count();
return 0;
}
