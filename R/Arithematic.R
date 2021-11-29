writeLines("\n\t\tArithemetic Operators")
num1<-as.integer(readline(prompt = "\n\tEnter the number 1:"))
num2<-as.integer(readline(prompt = "\n\tEnter the number 2:"))
writeLines("\n\t\tEnter your choice:")
writeLines("\n\t\tAddition")
writeLines("\n\t\tSubtraction")
writeLines("\n\t\tMultiplication")
writeLines("\n\t\tDivisions")
choice<-as.integer((readline(prompt = "")))
switch(choice,
              cat("\n\t\tThe Addition is:",num1+num2),
              cat("\n\t\tThe Subtration is:",num1-num2),
              cat("\n\t\tThe Multiplication is:",num1*num2),
              cat("\n\t\tThe Division is:",num1/num2))
