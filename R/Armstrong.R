writeLines("Armstrong Number")
num1<-as.integer(readline(prompt = "Enter the Number1: "))
sum =0
temp=num1
while(temp>0)
{
  digit = temp %% 10
  sum = sum + (digit ^ 3)
  temp = floor(temp / 10)
}
if(num1==sum)
{
 print(paste('Armstrong number'))
}else
{
  print(paste('Not a Armstrong number'))
}

