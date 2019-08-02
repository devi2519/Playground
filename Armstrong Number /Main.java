#include <stdio.h>
int main() {
	//Type your code
  int n,sum=0,temp;
  scanf("%d",&n);
  temp=n;
  while(n!=0)
  {
    int r=(n%10)*(n%10)*(n%10);
    sum+=r;
    n/=10;
  }
  if(temp==sum)
  printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}