/* Accept character from user if it is capital then display all the chaaracter from input character t
till Z if inputt character is small then print all the charactrs in reverse order 
till a. in other cases return directly
I/P: Q
O/P: Q  R  S  T U  V  W  X  Y  Z
I/P :m
O/P: m  l  k  j  i  h  g  f  e  d  c  b  a
*/
#include<iostream>
using namespace std;
 void Display(char ch)
 {
    
    while(ch!='\0')
    {
    if((ch>='A') &&(ch<='Z'))
    {
        cout<<ch<<"  ";
        ch++;
    
    }
    
    else if((ch<='z') &&(ch>='a'))
    {
        cout<<ch<<"  ";
        ch--;
    }
    
    else{
        return;
    }
    }
    
 }
int main()
{
    char cValue='\0';

    cout<<"Enter any character"<<endl;
    cin>>cValue;
    Display(cValue);

    return 0;
}