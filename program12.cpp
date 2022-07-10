//WAP which accept string from user & count number of Small characters
#include<iostream>
using namespace std;
int CountSmall(char *src)
{
    int count=0;
    while(*src!='\0')
    {
        if((*src>='a') && (*src<='z'))
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
    iRet=CountSmall(Arr);
    cout<<"Number of Small Characters Are:"<<iRet<<endl;
    return 0;
}