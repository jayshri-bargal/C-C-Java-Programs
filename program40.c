//write recursive program which display beow pattern
//O/P :a b c d e f
#include<stdio.h>
void Display()
{
    static char iCnt='a';
    if(iCnt <= 'f')
    {
        printf("%c ",iCnt);
        iCnt++;
        Display();
    }
}
int main()
{
    Display();
    return 0;
}