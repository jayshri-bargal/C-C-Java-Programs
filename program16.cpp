//Accept string from user  Count Small Character using AsCII value
#include<iostream>
using namespace std;

int CountSmall(char str[])
{
    int iCnt=0;
    while(*str!='\0')
    {
        if((*str>=97) && (*str <=122))
        {
            iCnt++;
        }
        str++;
    }
    return iCnt;
}
int main()
{
    char Arr[20];
    int iRet=0;

    cout<<"Enter string"<<endl;
   cin.getline(Arr,20);

    iRet=CountSmall(Arr);
    cout<<"Small Characters in String are:"<<iRet<<" times "<<endl;
    return 0;
}

