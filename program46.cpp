//write a recursive program which accept number from user & disply below pattern
//I/P: 5
//O/P: 5  *  4  *  3  *  2  * 1  *
#include<iostream>
using namespace std;
void Display(int ino)       //without Recursion
{
    int iCnt=0;
for(iCnt=ino; iCnt>=1;iCnt--)
{
    cout<<iCnt  <<"  *  ";
}

}
void DisplayR(int ino)       //using Recursion
{
    static int iCnt=ino;
    if(iCnt>=1)
    {
        cout<<iCnt<<"  *  ";
        iCnt--;
        DisplayR(ino);
    }
}
int main()
{
    int iValue=0;
    cout<<"Enter the Number\n";
    cin>>iValue;
    DisplayR(iValue);
    return 0;
}