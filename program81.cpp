//write a program to multiply two numbers
#include<iostream>
using namespace std;
template <class T>
T Max(T iNo1,T iNo2,T iNo3)
{
    T Max;
    if(iNo1 >iNo2)
    {
        Max = iNo1;
    }
   else if(iNo2 > iNo3)
   {
    Max = iNo2;
   }
   else if((iNo3 >iNo2)&&(iNo3>iNo1))
   {
    Max=iNo3;
   }
   return Max;
}
int main()
{
    int iValue1,iValue2,iValue3;
    cout<<"Enter first Number"<<endl;
    cin>>iValue1;
    cout<<"Enter Second Number "<<endl;
    cin>>iValue2;
    cout<<"Enter third Number"<<endl;
    cin>>iValue3;
    int iret = Max(iValue1,iValue2,iValue3);
    cout<<"Maximum number is  "<<iret<<endl;

    float fValue1,fValue2,fValue3;
    cout<<"Enter first Number"<<endl;
    cin>>fValue1;
    cout<<"Enter Second Number "<<endl;
    cin>>fValue2;
    cout<<"Enter third number"<<endl;
    cin>>fValue3;
    float fret = Max(fValue1,fValue2,fValue3);
    cout<<" Maximum number is"<<fret<<endl;

    return 0;
}