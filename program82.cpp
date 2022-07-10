//write a generic program to accept N value from user and return Addition of 
//that Nuber
#include<iostream>
using namespace std;

template<class T>
T Addition(T Arr[],int length)
{
    T Sum=0;
    for(int i=0;i<length; i++)
    {
        Sum = Sum+Arr[i];
    }
    return Sum;
}
int main()
{
    int size;
    int *ptr=NULL;
    cout<<"Enter size of Array"<<endl;
    cin>>size;
    ptr=(int*)malloc(sizeof(int)*size);
    cout<<"Enter the elements of Array "<<endl;
    for(int i=0; i<size; i++)
    {
        cin>>ptr[i];
    }
    int ret = Addition(ptr,size);
    cout<<"Summation of elements are: "<<ret<<endl;

    float *ptr1=NULL;
    cout<<"Enter size of Array"<<endl;
    cin>>size;
    ptr1=(float*)malloc(sizeof(float)*size);
    cout<<"Enter the elements of Array "<<endl;
    for(int i=0; i<size; i++)
    {
        cin>>ptr1[i];
    }
    float fret = Addition(ptr1,size);
    cout<<"Summation of elements are: "<<fret<<endl;

   /* char *ptr=NULL;
    cout<<"Enter size of Array"<<endl;
    cin>>size;
    ptr=(char*)malloc(sizeof(char)*size);
    cout<<"Enter the elements of Array "<<endl;
    for(int i=0; i<size; i++)
    {
        cin>>ptr[i];
    }
    char cret = Addition(ptr,size);
    cout<<"Summation of elements are: "<<cret<<endl;
    */

    return 0;
}
