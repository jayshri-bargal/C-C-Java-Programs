//generic program accept one number & one value from usr.print that value that number 
//of times on screen
#include<iostream>
using namespace std;

template<class T>
void Display(T iNo, int value)
{
    for(int i=1; i<=value; i++)
    {
        cout<<iNo<<"  ";
    }
}
int main()
{
    int no;
    int iSize;
    cout<<"Enter value"<<endl;
    cin>>no;
    cout<<"Enter Size "<<endl;
    cin>>iSize;
    Display(no,iSize);

    float fno;
    int fSize;
    cout<<"Enter value "<<endl;
    cin>>fno;
    cout<<"Enter Size "<<endl;
    cin>>fSize;

    Display(fno,fSize);
    
    char cno;
    int cSize;
    cout<<"Enter value "<<endl;
    cin>>cno;
    cout<<"Enter Size "<<endl;
    cin>>cSize;
    Display(cno,cSize);


}