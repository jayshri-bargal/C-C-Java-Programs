//write a Recursive program which accept string from user and display smallest digit
#include<stdio.h>

int SmallestDigit(int iNo)
{
    static int iDigit=0;
  static int iMin=9;
    if(iNo!= 0)
    {
        iDigit=iNo%10;
        if(iDigit < iMin)
        {
            iMin = iDigit;
            
        }
        iNo = iNo/10;

        SmallestDigit(iNo);

    }
    return iMin;
}
int main()
{
    int iValue=0,iret=0;
    printf("Enter number\n");
    scanf("%d",&iValue);
    iret= SmallestDigit(iValue);
    printf("Smallest digit is :%d\n",iret);
    return 0;
}