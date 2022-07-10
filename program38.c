//write recursive program which display beow pattern
//O/P :5  4  3  2  1
#include<stdio.h>
void Display()
{
    static int iCnt=5;
    if(iCnt >= 1)
    {
        printf("%d ",iCnt);
        iCnt--;
        Display();
    }
}
int main()
{
    Display();
    return 0;
}