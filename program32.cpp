//accept string from user & copy character of that string into another string
//by removing all white spaces
#include<iostream>
using namespace std;
void StrCpyRev(char *src,char *dest)
{

    while(*src!='\0')
    {
        if(*src!=' ')
        {
        *dest=*src;
        dest++;
        
        }
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