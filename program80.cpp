//write a program to multiply two numbers
#include<iostream>
using namespace std;
template <class T>
T Multiply(T iNo1,T iNo2)
{
    T Ans;
    Ans = iNo1 * iNo2;
    return Ans;
}
int main()
{
    int iValue1,iValue2;
    cout<<"Enter first Number"<<endl;
    cin>>iValue1;
    cout<<"Enter Second Number "<<endl;
    cin>>iValue2;
    int iret = Multiply(iValue1,iValue2);
    cout<<"Multiplication is  "<<iret<<endl;

    float fValue1,fValue2;
    cout<<"Enter first Number"<<endl;
    cin>>fValue1;
    cout<<"Enter Second Number "<<endl;
    cin>>fValue2;
    float fret = Multiply(fValue1,fValue2);
    cout<<"Multiplication is  "<<fret<<endl;

    return 0;
}