//write a Recursive program which display elow pattern
//I/P : 5
//O/P :1 2 3 4 5

#include<stdio.h>
void Display(int iNo)
{
    static int iCnt=1;
    if(iCnt <= iNo)
    {
        printf("%d  ",iCnt);
        iCnt++;
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