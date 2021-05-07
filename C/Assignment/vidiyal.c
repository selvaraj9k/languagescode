#include<stdio.h>
#include<string.h>
struct Student
{
	int subject_1,subject_2,subject_3,subject_4,subject_5,total;
        float Average;
        char name[20],rollno[9];
}s[100];
int main()
{
	int n,i;
	printf("Enter no of Students: ");
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
	printf("\n");
	printf("Enter Student %d  Details\n",i);
	printf("Enter the Name: ");
	scanf("%s",s[i].name);
	printf("Enter the Rollno: ");
	scanf("%s",s[i].rollno);
	printf("Enter the Subject 1:");
	scanf("%d",&s[i].subject_1);
	printf("Enter the Subject 2:");
        scanf("%d",&s[i].subject_2);
	printf("Enter the Subject 3:");
        scanf("%d",&s[i].subject_3);
	printf("Enter the Subject 4:");
        scanf("%d",&s[i].subject_4);
	printf("Enter the Subject 5:");
        scanf("%d",&s[i].subject_5);
	s[i].total=s[i].subject_1+s[i].subject_2+s[i].subject_3+s[i].subject_4+s[i].subject_5;
	s[i].Average=s[i].total/5;
	}
	for(i=1;i<=n;i++)
	{
	printf("\n");
	printf("Student %d Details\n",i);
	printf("Name:%s\n",s[i].name);
	printf("Rollno:%s\n",s[i].rollno);
	printf("Subject 1:%d\nSubject 2:%d\nSubject 3:%d\nSubject 4:%d\nSubject 5:%d\n",s[i].subject_1,s[i].subject_2,s[i].subject_3,s[i].subject_4,s[i].subject_5);
	printf("Total Mark:%d\n",s[i].total);
	printf("Average:%f\n",s[i].Average);
	if(s[i].Average>=90&&100>=s[i].Average)
	{
		printf("Grade:'S'\n");
	}
	else if(s[i].Average>=80&&90>s[i].Average)
	{
	 	printf("Grade:'A'\n");
	}
	else if(s[i].Average>=70&&80>s[i].Average)
	{
		printf("Grade:'B'\n");
	}
	else if(s[i].Average>=60&&70>s[i].Average)
	{
		printf("Grade:'C'\n");
	}
	else if(s[i].Average>=50&&60>s[i].Average)
	{
		printf("Grade:'D'\n");
	}
	else
	{
		printf("Grade:'F'\n");
	}
	}
	return 0;
}
