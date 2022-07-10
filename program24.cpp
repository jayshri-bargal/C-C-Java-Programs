//accept string from user and Accept one character. & return index of last occurance
//of that character.

#include<iostream>
using namespace std;
int FirstOccurance(char *str,char ch)
{
    int i=0,LastIndex=-1;
  
    for(i=0;i<str[i];i++)
    {
        if(ch==str[i])
        {
            LastIndex= i;
        }
    }
    return LastIndex;
}
int main()
{
    char Arr[20],cValue='\0';
    int iRet=0;
    cout<<"Enter String"<<endl;
    cin.getline(Arr,20);
    cout<<"Enter chracter to search Last index from string"<<endl;
    cin>>cValue;

    iRet=FirstOccurance(Arr,cValue);
    cout<<" Last index of  "<<cValue<<" is "<< iRet<<endl;
    
    

    return 0;
    
}