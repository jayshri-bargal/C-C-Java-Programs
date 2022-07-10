//(Lseek)  accept file from user & read the data from 10th offset read next 5 offset
#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>
#include<stdbool.h>
int main()
{
    char Fname[20];
    int fd=0;
    char Data[10];

    printf("Enter file name \n");
    scanf("%s",Fname);

    fd = open(Fname,O_RDONLY);
    if(fd==-1)
    {
        printf("Unable to open file");
        return -1;
    }

    //0  starting point
    //1   current position
    //2  end point

    lseek(fd,10,0);   
    read(fd,Data,5);
    write(1,Data,5);
    
    return 0;
}