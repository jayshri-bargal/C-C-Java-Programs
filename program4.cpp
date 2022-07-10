//Accept character from user & check whether it is special Symbol or not
//(!,@,#,$,%,^,&,*).

#include<iostream>
using namespace std;
bool ChkSpecial(char ch)
{
    if((ch=='!') || (ch=='@')||(ch=='$')||(ch=='%')||(ch=='^')||(ch=='#')||(ch=='*')||(ch=='&'))
    {
        return true;
    }
    else
    {
        return false;
    }
}
int main()
{
    bool bRet;
    char cValue='\0';
    cout<<"Enter any Symbol"<<endl;
    cin>>cValue;
   bRet = ChkSpecial(cValue);
   if(bRet==true)
   {
       cout<<"it is a Symbol"<<endl;
   }
   else
   {
       cout<<"it is not a Symbol"<<endl;
   }

   return 0;
}