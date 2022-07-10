//WAP which accept string from user & conver that Strng into uper case

#include<iostream>
using namespace std;

void struprx(char *str)
{
    while(*str!='\0')
    {
        if((*str>='a')&&(*str<='z'))
        {
        *str = *str - 32;
        }
        str++;
    }
}
int main()
{
    char Arr[20];

    cout<<"Enter string"<<endl;
    cin.getline(Arr,20);

    struprx(Arr);
    cout<<"modified String is  " <<Arr<<endl;
    return 0;
}