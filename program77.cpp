// write a generic program accept N values and Count frequency of any specific value
#include<iostream>
using namespace std;

template<class T>
int Frequency(T Arr[],int Length,T no)
{
    int count=0;
for(int i=0; i< Length;i++)
{
    if(Arr[i]==no)
    {
        count++;
    }
}
return count;
}
int main()
{
    int *ptr=NULL;
    int Size=0,iValue=0;
    cout<<"Enter the Size of Array "<<endl;
    cin>>Size;
   // cout<<"Enter the number to find Frequency"<<endl;
    //cin>>iValue;
    ptr = (int*)malloc(sizeof(int)*Size);
    cout<<"Enter the elements of Array "<<endl;
    for (int i=0; i < Size; i++)
    {
        cin>>ptr[i];
    }
    cout<<"Enter the number to find Frequency"<<endl;
    cin>>iValue;
    int iret=Frequency(ptr,Size,iValue);
    cout<<"Frequency of  "<<iValue<<" is"<<iret<<endl;

    return 0;

    
}