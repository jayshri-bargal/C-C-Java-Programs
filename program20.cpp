//WAP which accept string from user &count white spaces
#include<iostream>
using namespace std;
int strspace(char *str)
{
    int count=0;
    while(*str!='\0')
    {
        if(*str==' ')
        {
        count++;
        }
        str++;
    }

    return count;
}
int main()
{
    char Arr[20];
    int iRet=0;
    cout<<"Enter String"<<endl;
    cin.getline(Arr,20);
    iRet=strspace(Arr);
    cout<<"White spaces in string  " <<iRet <<" times"<<endl;

    return 0;
    
}