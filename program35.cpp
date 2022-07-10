//accept string from user & copy character of that string into another string
//by toggling the case
#include<iostream>
using namespace std;
void StrCpyToggle(char *src,char *dest)
{

    while(*src!='\0')
    {
        if((*src>='A') && (*src<='Z'))
        {
            *src = *src+32;
        } 
        else if((*src>='a') &&(*src<='z'))
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

    StrCpyToggle(Arr,Brr);
    cout<<"Copied string is : "<<Brr<<endl;
    
}