//accept string from user & copy the content of that string into another string.
#include<iostream>
using namespace std;

void StrCpyX(char *src,char *dest)
{
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
    char Arr[20],Brr[20];
    cout<<"Enter string  "<<endl;
    cin.getline(Arr,20);

    StrCpyX(Arr,Brr);
    cout<<"updated String is  "<<Brr<<endl;

    return 0;
    
}