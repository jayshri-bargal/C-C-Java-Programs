//Accept two string from user And perform string concatination
//string concatination
#include<iostream>
using namespace std;

void StrCatX(char *src,char *dest)
{
    while(*src!='\0')
    {  
        src++;
    }

    while(*dest!='\0')
    {
    *src=*dest;
    src++;
    dest++;
    }
*src='\0';

}
int main()
{
    char Arr[20],Brr[20];
    cout<<"Enter string  "<<endl;
    cin.getline(Arr,30);

    cout<<"Enter second String:"<<endl;
    cin.getline(Brr,30);

    StrCatX(Arr,Brr);
    cout<<"String after concatination is  "<<Arr<<endl;

    return 0;
    
}