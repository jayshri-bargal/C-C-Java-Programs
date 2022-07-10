//accept string from user & copy character of that string into another string
#include<iostream>
using namespace std;
void StrCpyRev(char *src,char *dest)
{

    char *start=src;
    char *end=src;
    char temp;
    while(*end!='\0')
    {
        end++;
    }
    end--;
    while(start < end)
    {
       temp=*start;
       *start=*end;
       *end=temp;
       start++;
       end--;
    }
    while(*src!='\0')
    {
        *dest=*src;
        src++;
        dest++;
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