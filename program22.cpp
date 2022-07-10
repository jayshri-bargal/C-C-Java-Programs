//accept string from user and Accept one character.& return frequency of that character
#include<iostream>
using namespace std;
int ChkChar(char *str,char ch)
{
    int Count=0;
    while(*str!='\0')
    {
        if(*str==ch)
        {
            Count++;
        }
        str++;
    }
    return Count;
}
int main()
{
    char Arr[20],cValue='\0';
    int iRet=false;
    cout<<"Enter String"<<endl;
    cin.getline(Arr,20);
    cout<<"Enter chracter to find frequency from string"<<endl;
    cin>>cValue;

    iRet=ChkChar(Arr,cValue);
    cout<<"Frequency of "<<cValue<<" is "<< iRet<<endl;
    return 0;
    
}