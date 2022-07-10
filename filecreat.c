//to create file
#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>

int main()
{
    char fname[30];
    int fd=0;

    printf("Enter the file name to create\n");
    scanf("%s",&fname);


    fd= creat(fname,0777);
    if(fd==-1)
    {
        printf("unable to create the file\n");
        return -1;
    }
    printf("File is successfully created with FD %d\n",fd);

    
    return 0;
}