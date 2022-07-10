// write a generic program accept N values and Search Last Occurance of specific value
#include<iostream>
using namespace std;

template<class T>
int LastOccurance(T Arr[],int Length,T no)
{
    int i=0;
for(i=Length; i>=0 ;i--)
{
    if(Arr[i]==no)
    {
        break;
    }
}
if(i==Length)
{
    return 1;
}
else 
{
    return i;
}

}
int main()
{
    int *ptr=NULL;
    int Size=0,iValue=0;
    cout<<"Enter the Size of Array "<<endl;
    cin>>Size;
   
    ptr = (int*)malloc(sizeof(int)*Size);
    cout<<"Enter the elements of Array "<<endl;
    for (int i=0; i < Size; i++)
    {
        cin>>ptr[i];
    }
    cout<<"Enter the number to search First Occcurance"<<endl;
    cin>>iValue;
    int iret=LastOccurance(ptr,Size,iValue);
    if(iret==1)
    {
        cout<<"Element is not there"<<endl;
    }
    else
    {
        cout<<"Last Occurance of  "<<iValue<<" is "<<iret<<endl;
    }

    return 0;

    
}