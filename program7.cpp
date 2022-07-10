/*Accept character from user. if it is small display its corrosponding capital
//character, and if it is capital display its corrosponding small.in other 
//display as it is
Input: Q
Output: q
Input: m
Output: M
I/p:   4
O/p    4
I/P:   #
 O/P   #
 */
#include<iostream>
using namespace std;
void Display(char ch)
{
    if((ch>='a')&&(ch<='z'))
    {
        ch=ch-32;
        cout<<ch<<endl;
    }
    else if((ch>='A')&&(ch<='Z'))
    {
        ch=ch+32;
        cout<<ch<<endl;
    }
    else if((ch>=32)&&(ch<=57))
    {
        cout<<ch<<endl;
    }
    
}   
int main()
{
    char cValue='\0';
    cout<<"Enter a character"<<endl;
    cin>>cValue;
    Display(cValue);

    return 0;
}