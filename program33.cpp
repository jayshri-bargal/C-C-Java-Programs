//accept string from user & copy character of that string into another string
//by converting all small characters into capital case
#include<iostream>
using namespace std;
void StrCpyRev(char *src,char *dest)
{

    while(*src!='\0')
    {
        if((*src>='a') && (*src<='z'))
        {
            *src = *src-32;
        }
        *dest=*src;
        dest++;
        src++;  
    }

    *dest='\0';
}


int main()
{
    char Arr[30],Brr[30];
    cout<<"Enter String "<<endl;
    cin.getline(Arr,20);

    StrCpyRev(Arr,Brr);
    cout<<"Copied string is : "<<Brr<<endl;
    
}