// W.A.P which accept string from user And Display only digits from that String
#include<iostream>
using namespace std;

void strDigit(char *str)
{
    while(*str!='\0')
    {
        if((*str>=48)&&(*str<=57))
        {
            cout<<*str<<"  ";
        }
        str++;
    }
}
int main()
{
    char Arr[20];
    cout<<"Enter String"<<endl;
    cin.getline(Arr,20);
    strDigit(Arr);
    cout<<"Digits from String "<<Arr<<endl;

    return 0;
}