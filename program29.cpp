//accept string from user & copy the small character of that 
// into another string
#include<iostream>
using namespace std;

void StrCpyX(char *src,char *dest)
{
while(*src!='\0')
{
    if((*src>='a') && (*src<='z'))
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
    char Arr[20],Brr[20];
    cout<<"Enter string  "<<endl;
    cin.getline(Arr,20);

    StrCpyX(Arr,Brr);
    cout<<"updated String is  "<<Brr<<endl;

    return 0;
    
}