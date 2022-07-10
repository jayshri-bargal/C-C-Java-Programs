//Write a Rexursive program which acccept number from user & return its product of digits
#include<stdio.h>

int ProductDigit(int iNo)
{
    static int Mult=1;
    int iDigit=0;
    if(iNo > 0)
    {
       iDigit = iNo%10;
       Mult = Mult * iDigit;
       iNo = iNo/10;
       ProductDigit(iNo);
    }
    return Mult;
}
int main()
{
    int iValue=0,iRet=0;
    printf("Enter Number\n");
    scanf("%d",&iValue);

    iRet = ProductDigit(iValue);
    printf("Product of Digits Are: %d\n ",iRet);

    return 0;
}