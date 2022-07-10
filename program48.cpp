//write a recursive program which accept String from user & count number of characters
//I/P: Hello
//O/P: 5
#include<iostream>
using namespace std;

/*int StrlenX(char *str)
{
    int iCnt=0;
    while(*str!='\0')
    {
        iCnt++;
        str++;
    }
    return iCnt;
}*/

int StrlenX(char *str)
{
    static int iCnt=0;
    if(*str!='\0')
    {
        iCnt++;
        str++;
        StrlenX(str);
    }
    return iCnt;
}
int main()
{
    char Arr[20];
    int iret=0;
    cout<<"Enter string\n";
    cin.getline(Arr,20);
 iret=StrlenX(Arr);
 cout<<"Number of Character is : "<<iret<<endl;
}