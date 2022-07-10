//WAP which accept string from user & check whether it contain vowel or not.
#include<iostream>
using namespace std;
bool ChkVowel(char *src)
{
    while(*src!='\0')
    {
        if((*src=='a') || (*src=='e')||(*src=='i')||(*src=='o')||(*src=='u'))
        {
            return true;
        }

        src++;
    }
  
}

int main()
{
    bool bRet;
    char Arr[20];
    cout<<"Enter String"<<endl;
    cin.getline(Arr,20);
    bRet=ChkVowel(Arr);
    if(bRet==true)
    {
        cout<<"It Contain Vowel"<<endl;
    }
    else
    {
        cout<<"there is no vowel"<<endl;
    }
    
    return 0;
}