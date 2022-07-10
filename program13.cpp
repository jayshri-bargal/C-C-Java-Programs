//WAP which accept string from user & return diff bet frequency of
//small character & frequency of capita character
#include<iostream>
using namespace std;
int DiffFrequency(char *src)
{
    int count=0,count1=0;
    while(*src!='\0')
    {
        if((*src>='a') && (*src<='z'))
        {
            count++;
        }
        else if((*src>='A') && (*src<='Z'))
        {
            count1++;
        }
        src++;
    }
    return count-count1;
}
int main()
{
    int iRet=0;
    char Arr[20];
    cout<<"Enter String"<<endl;
    cin.getline(Arr,20);
    iRet=DiffFrequency(Arr);
    cout<<"difference between frequency :"<<iRet<<endl;
    return 0;
}