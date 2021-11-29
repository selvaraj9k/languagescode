writeLines("\tHighest Common Factor")
a <- as.integer(readline(prompt="Enter First number"))
b <- as.integer(readline(prompt="Enter Second number"))
if(a<b){
  s <- a
}else{
  s <-b
}
hcf <- 0;
for(i in seq(1,s)){
  if(a%%i==0 && b%%i==0)
  {
    hcf<-i
  }
}
cat("HCF of number is",hcf)