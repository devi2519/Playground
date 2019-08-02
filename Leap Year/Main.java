#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  if(n%400==0)
    printf("LEAP YEAR",n);
  else if(n%100==0)
        printf("NOT LEAP YEAR",n);
   else if(n%4==0)
        printf("LEAP YEAR",n);
  else
    printf("NOT LEAP YEAR",n);
    
     
  
  
    
  //Type your code here
  return 0;
}