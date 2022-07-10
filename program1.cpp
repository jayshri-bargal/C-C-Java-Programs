//wap which displays AsCII table .Table contain Symbol,Decimal,HeXadecimal
// And oCtal of every member from 0 to 255.

#include<iostream>
using namespace std;

void DisplayASCII()
{
    int i=0;
    for(i=0; i<=255; i++)
    {
        cout<<" "<<(char)i<<i;
    }
}
int main()
{
    DisplayASCII();
    return 0;
}