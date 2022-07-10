//WAP which accept string from user & count number of capital characters
#include<iostream>
using namespace std;
int CountCapital(char *src)
{
    int count=0;
    while(*src!='\0')
    {
        if((*src>='A') && (*src<='Z'))
        {
            count++;
        }
        src++;
    }
    return count;
}
int main()
{
    int iRet=0;
    char Arr[20];
    cout<<"Enter String"<<endl;
    cin.getline(Arr,20);
    iRet=CountCapital(Arr);
    cout<<"Number of Capital Characters Are:"<<iRet<<endl;
    return 0;
}