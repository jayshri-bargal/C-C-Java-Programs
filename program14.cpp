//Accept string from user  Count Capital Character using ASCII value
#include<iostream>
using namespace std;

int CountCapital(char str[])
{
    int iCnt=0;
    while(*str!='\0')
    {
        if((*str>=65) && (*str <=90))
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

    iRet=CountCapital(Arr);
    cout<<"Capital Characters in String are:"<<iRet<<" times "<<endl;
    return 0;
}

