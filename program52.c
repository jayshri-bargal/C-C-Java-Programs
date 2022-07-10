//write a Recursive program which accept string from user and display Largest digit
#include<stdio.h>

int LargestDigit(int iNo)
{
    static int iDigit=0;
  static int iMax=0;
    if(iNo!= 0)
    {
        iDigit=iNo%10;
        if(iDigit > iMax)
        {
            iMax = iDigit;
            
        }
        iNo = iNo/10;

        LargestDigit(iNo);

    }
    return iMax;
}
int main()
{
    int iValue=0,iret=0;
    printf("Enter number\n");
    scanf("%d",&iValue);
    iret= LargestDigit(iValue);
    printf("Largest digit is :%d\n",iret);
    return 0;
}