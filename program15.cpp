//WAP which accept string from user & display it in Reverse order
#include<iostream>
using namespace std;
void Reverce(char *str)
{
   int Length=0,i=0;
   char ch;
    for(Length=0;str[Length];Length++);
    
    cout<<"length of the entered string is  "<<Length<<endl;
    for(i=0;i<Length/2;i++)
    {
        ch=str[i];
        str[i]=str[Length-1-i];
        str[Length-1-i] = ch;
    }
    
}

int main()
{
    int iRet=0;
    char Arr[20];
    cout<<"Enter String"<<endl;
    cin.getline(Arr,20);
    Reverce(Arr);
    cout<<"String after Reverse  " <<Arr <<endl;
    return 0;
}