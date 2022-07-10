//write a Recursive program which display elow pattern
//I/P : 5
//O/P :5 4 3 2 1

#include<stdio.h>
void Display(int iNo)
{
    static int iCnt=0;
    if(iNo >= 1)
    {
        printf("%d  ",iNo);
        iNo--;
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