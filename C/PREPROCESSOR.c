#include<stdio.h>
#include<string.h>
#define COURSES 5
int main()
{
    int i, choice;
    int date,month,year,age;
    char gender[20],name[20],rollno[30];
    
    printf("\nEnter the name:");
    scanf("%s",name);
    printf("\nEnter the rollno:");
    scanf("%s",rollno);
    printf("\nEnter the date of birth:");
    scanf("%d %d %d",&date,&month,&year);
    printf("\nEnter the age:");
    scanf("%d",&age);
    printf("\nEnter the gender:");
    scanf("%s",gender);
    printf("\nEnter /'1'/ to get grade as char /'or'/ Enter /'2'/ to get grade as int:");
    scanf("%d",&choice);
    #if(choice==1)
        int grade[COURSES];
    #else
        int grade[COURSES];
    #endif
    
    if(choice==1)
    {
        printf("\nEnterthe grade:");
        for(i=1;i<=COURSES;i++)
        {
            printf("\nEnter the grade of COURSES-%d=",i);
            scanf("%d",&grade[i]);
	}
    }
    else
    {
        printf("\nEnterthe grade:");
        for(i=1;i<=COURSES;i++)
        {
            printf("\nEnter the grade of COURSES-%d=",i);
            scanf("%d",&grade[i]);
        }
    }
    
    printf("\n***Marksheet*");
    printf("\nName         :%s",name);
    printf("\nRoll no      :%s",rollno);
    printf("\nDate of birth:%d %d %d",date,month,year);
    printf("\nAge          :%d",age);
    printf("\nGender       :%s",gender);
    if(choice==1)
    {
        for(i=1;i<=COURSES;i++)
        {
            printf("\nCOURSES-%d=%c",i,grade[i]);
        }
    }
    else
    {
        for(i=1;i<=COURSES;i++)
        {
            printf("\nCOURSES-%d=%d",i,grade[i]);
        }
    }
    return 0;
}
