//write a recursive program which accept number from user & return summation of its digits
//I/P: 879
//O/P: 24
#include<iostream>
using namespace std;
int SumOfDigit(int ino)       //without Recursion
{
    int idigit=0,sum=0;
    while(ino!=0)
    {
        idigit = ino%10;
        sum=sum+idigit;
        ino=ino/10;
    }
    return sum;
}


int SumOfDigitsR(int ino)       //using Recursion
{
    //int Sum=0;
   if(ino==0)
    return 0;

    else

        return ino%10+(SumOfDigitsR(ino/10));
   
}
int main()
{
    int iValue=0;
    cout<<"Enter the Number\n";
    cin>>iValue;
    int iret=SumOfDigitsR(iValue);
    printf("Summation of digits are: %d\n",iret);
    return 0;
}