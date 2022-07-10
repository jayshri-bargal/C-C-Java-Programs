//write a Recursive program which display elow pattern
//I/P : 6
//O/P :A  B  C  D  E  F

#include<stdio.h>
void Display(int iNo)
{
    static char ch='A';
  static int iCnt=0;
  if(iCnt < iNo)
    {
        printf("%c  ",ch);
        iCnt++;
        ch++;
        Display(iNo);
    }
}
int main()
{
    int iValue=0;
    printf("Enter a number\n");
    scanf("%d",&iValue);
    Display(iValue);

    return 0;
}