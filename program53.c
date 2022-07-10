//write a Recursive program which accept string from user and count small character
#include<stdio.h>

int SmallCharacter(char *str)
{
   static int iCnt=0;
    if(*str!='\0')
    {
        if((*str>='a') &&(*str<='z'))
        {
            iCnt++;
        }
       str++;
        SmallCharacter(str);
        
    }
    return iCnt;
}
int main()
{
    int iRet=0;
    char Arr[20];
    printf("Enter string\n");
    scanf(" %[^'\n]s",Arr);
    iRet = SmallCharacter(Arr);
    printf("Number of small character are: %d\n ",iRet);

    return 0;
}