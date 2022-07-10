//write a generic program to accept N value from user and return Smallest number

#include<iostream>
using namespace std;

template<class T>
T Minimum(T Arr[],int length)
{
    T Min = Arr[0];
    for(int i=0;i<length; i++)
    {
        if(Arr[i] < Min)
        {
        Min= Arr[i];
        }
    }
    return Min;
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
    int ret = Minimum(ptr,size);
    cout<<"smallest element is: "<<ret<<endl;

    float *ptr1=NULL;
    cout<<"Enter size of Array"<<endl;
    cin>>size;
    ptr1=(float*)malloc(sizeof(float)*size);
    cout<<"Enter the elements of Array "<<endl;
    for(int i=0; i<size; i++)
    {
        cin>>ptr1[i];
    }
    float fret = Minimum(ptr1,size);
    cout<<"smallest element is "<<fret<<endl;

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
