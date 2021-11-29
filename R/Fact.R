writeLines("\n\t\tFACTROIAL NUMBER")
fact=1
a<-as.integer(readline(prompt="\n\t\tEnter the Number:"))
for(i in 1:a)
{
  fact=fact*i
}
print(paste('The Factorial of',a,'is',fact))