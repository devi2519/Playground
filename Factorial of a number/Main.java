#include <stdio.h>
int main() {
	//Type your code
  int n,fact=1;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    fact*=i;
  }
  printf("%d\n",fact);
	return 0;
}