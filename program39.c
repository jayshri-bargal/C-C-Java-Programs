//write recursive program which display beow pattern
//O/P :A  B  C  D  E   F
#include<stdio.h>
void Display()
{
    static char iCnt='A';
    if(iCnt <= 'F')
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