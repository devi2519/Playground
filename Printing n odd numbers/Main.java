#include <stdio.h>
int main() {
	int n,i=1,temp=1;
  	scanf("%d",&n);
  	for(i=1;i<=n;i++)
    {
      printf("%d\n",temp);
      temp+=2;
    }
	return 0;
}