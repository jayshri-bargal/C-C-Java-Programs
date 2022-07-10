//Accept file from user & Display the data

#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>

void DisplayData(char Fname[])
{
    int fd=0,iRet=0;
    char Data[10];

 fd = open(Fname,O_RDWR);
    if(fd==-1)
    {
        printf("unable to open the file\n");
        return;
    }

    printf("File is Successfully opened with FD %d\n",fd);

   while((iRet=read(fd,Data,sizeof(Data))) !=0)
   {
    write(1,Data,iRet);
   }

   close(fd);
}

int main()
{
    char Fname[20];
    char Data[10];   //Mug
   
    printf("Enter file name to open \n");
    scanf("%s",Fname);

    DisplayData(Fname);

   

    return 0;
}