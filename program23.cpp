//accept strin from user and Accept one character. & return index of first occurance
//of that character.

#include<iostream>
using namespace std;
int FirstOccurance(char *str,char ch)
{
    int i=0;
  
    for(i=0;i<str[i];i++)
    {
        if(ch==str[i])
        {
            return i;
        }
    }
    return -1;
}
int main()
{
    char Arr[20],cValue='\0';
    int iRet=0;
    cout<<"Enter String"<<endl;
    cin.getline(Arr,20);
    cout<<"Enter chracter to search first index from string"<<endl;
    cin>>cValue;

    iRet=FirstOccurance(Arr,cValue);
    cout<<" First index of  "<<cValue<<" is "<< iRet<<endl;
    
    

    return 0;
    
}