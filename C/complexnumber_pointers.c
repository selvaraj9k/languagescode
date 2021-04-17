#include<stdio.h>
struct complex
{
    float real;
    float imaginary;
};

struct complex addition(struct complex *p, struct complex *q);
struct complex subtraction(struct complex *p, struct complex *q);
int main()
{
    struct complex cnum1, cnum2, add,sub;
    printf("Enter real and imaginary part of first complex number:\n");
    scanf("%f%f", &cnum1.real, &cnum1.imaginary);
    printf("Enter real and imaginary part of second complex number:\n");
    scanf("%f%f", &cnum2.real, &cnum2.imaginary);

    add = addition(&cnum1, &cnum2);
    sub = subtraction(&cnum1, &cnum2);
   printf("Sum = %.1f + %.fi\n", add.real,add.imaginary);
   printf("sub = %.1f + %.fi\n", sub.real,sub.imaginary);
    return 0;
}

struct complex addition(struct complex *p, struct complex *q)
{
    struct complex temp1;
    temp1.real = p->real+ q->real;
    temp1.imaginary = p->imaginary+q->imaginary;
    return temp1;
}
struct complex subtraction(struct complex *p, struct complex *q)
{
    struct complex temp2;
    temp2.real = p->real- q->real;
    temp2.imaginary = p->imaginary-q->imaginary;
    return temp2;
}
