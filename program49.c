//Write a Rexursive program which acccept number from user and display its factorial
#include<stdio.h>

int Factorial(int iNo)
{
    static int Fact=1;
    if(iNo > 0)
    {
        Fact=Fact*iNo;
        iNo--;
        Factorial(iNo);
    }
    return Fact;
}
int main()
{
    int iValue=0,iRet=0;
    printf("Enter Number\n");
    scanf("%d",&iValue);

    iRet = Factorial(iValue);
    printf("Factorial is %d\n :",iRet);

    return 0;
}