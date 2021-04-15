#include<stdio.h>
typedef struct complex
{
	float real;
	float imag;
}complex;

complex add(complex n1,complex n2);
complex sub(complex n1,complex n2);
int main()
{
	complex n1,n2,result1,result2;
	printf("Enter the real and imaginary parts: ");
	scanf("%f%f",&n1.real,&n1.imag);
	printf("Enter the real and imaginary parts: ");
        scanf("%f%f",&n2.real,&n2.imag);
	result1=add(n1,n2);
	result2=sub(n1,n2);
        printf("Sum = %f + %fi\n", result1.real, result1.imag);
	printf("Sub = %f + %fi\n", result2.real, result2.imag);
	return 0;
}
complex add(complex n1,complex n2)
{
	complex temp1;
	temp1.real=n1.real+n2.real;
	temp1.imag=n1.imag+n2.imag;

	return temp1;
}
complex sub(complex n1,complex n2)
{
	complex temp2;
        temp2.real=n1.real-n2.real;
        temp2.imag=n1.imag-n2.imag;
        return temp2;
}
