//write recursive program which display beow pattern
//O/P :*  *  *  *  *
#include<stdio.h>
void Display()
{
    static int iCnt=0;
    if(iCnt < 5)
    {
        printf("*\t");
        iCnt++;
        Display();
    }
}
int main()
{
    Display();
    return 0;
}