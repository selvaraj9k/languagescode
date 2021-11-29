writeLines("\n\t\tFinding Using Leap year")

year<-as.integer(readline(prompt = "Enter the Year: "))
LeapYear = function(year)
LeapYear(year)
{
  if((year%%4)==0)
  {
    if((year%%100)==0)
    {
      if((year%%400)==0)
      {
        print(paste(year, 'is a Leap year'))
      }
      else
      {
        print(paste(year, 'is not a Leap year'))
      }
    }
   else
   {
     print(paste(year, 'is a leap Year'))
   }
  }
  else
  {
    print(paste(year, 'is not a leap year'))
  }
}