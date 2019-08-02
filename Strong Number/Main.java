#include <stdio.h>
int main() {
  //Type your code
  int n,sum=0,fact,no;
  scanf("%d",&n);
  no=n;
  while(n!=0)
  {
    fact=1;
    int temp=n%10;
    for(int i=1;i<=temp;i++)
    {
      fact*=i;
    }
    sum+=fact;
    n/=10;
  }
  if(sum==no)
    printf("Yes");
  else
    printf("No");
  return 0;
}