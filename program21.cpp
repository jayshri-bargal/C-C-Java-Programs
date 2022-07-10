//accept strin from user and Accept one character.check whether that character
//is present in string or not.
#include<iostream>
using namespace std;
bool ChkChar(char *str,char ch)
{
    while(*str!='\0')
    {
        if(*str==ch)
        {
            return true;
        }
        
        str++;
    }
}
int main()
{
    char Arr[20],cValue='\0';
    bool bRet=false;
    cout<<"Enter String"<<endl;
    cin.getline(Arr,20);
    cout<<"Enter chracter to search from string"<<endl;
    cin>>cValue;

    bRet=ChkChar(Arr,cValue);
    if(bRet==true)
    {
        cout<<cValue<<"  present in string"<<endl;
    }
    else
    {
        cout<<cValue<<"  not present in String"<<endl;
    }

    return 0;
    
}