//write a Recursive program which accept string from user and return its Reverse
#include<stdio.h>

int Reverse(int iNo)
{
    static int iDigit=0;
  static int rev=0;
    if(iNo!= 0)
    {
        iDigit=iNo%10;
        rev =rev*10+iDigit;
        iNo = iNo/10;
        Reverse(iNo);

    }
    return rev;
}
int main()
{
    int iValue=0,iret=0;
    printf("Enter number\n");
    scanf("%d",&iValue);
    iret= Reverse(iValue);
    printf("Reverse number is :%d\n",iret);
    return 0;
}