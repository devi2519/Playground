#include <stdio.h>
int main() {
	int n,sum=0;
    scanf("%d",&n);
	while(n!=0)
    {
      int temp=n%10;
      n/=10;
      sum+=temp;;
    }
  	printf("%d",sum);
	return 0;
}