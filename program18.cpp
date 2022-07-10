//WAP which accept string from user And toggle that string
#include<iostream>
using namespace std;

void strtogglex(char *str)
{
    while(*str!='\0')
    {
        if((*str>='a')&&(*str<='z'))
        {
            *str = *str-32;
        }
        else if((*str>='A')&&(*str<='Z'))
        {
            *str = *str +32;
        }
        str++;
    }
}
int main()
{
    char Arr[20];
    cout<<"Enter string"<<endl;
    cin.getline(Arr,20);
    strtogglex(Arr);
    cout<<"Modified String is  "<<Arr<<endl;
    return 0;
}