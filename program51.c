//write a Recursive program which accept string from user and count number of white Spaces
#include<stdio.h>

int WhiteSpaces(char *str)
{
   static int iCnt=0;
    if(*str!='\0')
    {
        if(*str==' ')
        {
            iCnt++;
        }
       str++;
        WhiteSpaces(str);
        
    }
    return iCnt;
}
int main()
{
    int iRet=0;
    char Arr[20];
    printf("Enter string\n");
    scanf(" %[^'\n]s",Arr);
    iRet = WhiteSpaces(Arr);
    printf("Number of White Spaces are: %d\n ",iRet);

    return 0;
}