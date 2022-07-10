/*accept string from user & copy the content of that string into another string
I/P:    "Marvellous Multi os"
            10
O/P:         "Maevellous"
Note:    if third parameter is greater than the size of source string then copy 
whole string into destination
*/
#include<iostream>
using namespace std;
void StrCpyX(char *src,char *dest,int iCnt)
{
    //Filter
    while((*src!='\0') && (iCnt!=0))
    {
        *dest=*src;
        src++;
        dest++;
        iCnt--;
    }
    *dest='\0';
}
int main()
{
    char Arr[20],Brr[20];
    cout<<"Enter String "<<endl;
    cin.getline(Arr,20);
    StrCpyX(Arr,Brr,10);
    cout<<"updated String is :"<<Brr<<endl;

    return 0;
}