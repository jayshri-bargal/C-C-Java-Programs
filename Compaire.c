//accept Two existing file And Compaire the data into that two file 
#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>
#include<stdbool.h>
#define FILESIZE 1024

bool FileCompaire(char Source[],char Destination[])
{
    int Fdsrc=0,Fddest=0,iRet1=0,iRet2=0,iCmp=0;
    char Buffer1[FILESIZE];
    char Buffer2[FILESIZE];

    Fdsrc = open(Source,O_RDONLY);
    if(Fdsrc==-1)
    {
        printf("Unable to open source file\n");
        return false;
    }

    Fddest = open(Destination,O_RDONLY);
    if(Fddest == -1)
    {
        printf("Unable to create new file\n");
        return false;
    }

    while(1)
    {

    iRet1 = read(Fdsrc,Buffer1,FILESIZE);
    iRet2 = read(Fddest,Buffer2,FILESIZE);
   
    if((iRet1==0) || (iRet2 == 0) || (iRet1!=iRet2))
    {
        break;
    }
    iCmp = memcmp(Buffer1,Buffer2,iRet1);
    if(iCmp!=0)
    {
        break;
    }

    }
    if((iRet1 == 0) && (iRet2==0))
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
    char Fname1[20];
    char Fname2[20];
    bool bRet;

    printf("Enter file name which contains the data\n");
    scanf("%s",Fname1);

    printf("Enter the file name that you want to copy the data\n");
    scanf("%s",Fname2);

    bRet=FileCompaire(Fname1,Fname2);
    if(bRet==true)
    {
        printf("Files are same\n");
    }
    else
    {
        printf("files are not same\n");
    }

    return 0;

}