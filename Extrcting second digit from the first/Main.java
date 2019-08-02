#include <stdio.h>
int main() {
	int n,temp=1,no;
    scanf("%d",&n);
  	no=n;
	while(n!=0)
    {
      temp=temp*10;
      n/=10;
    }
  	temp/=10;
  	int res=no%temp;
  	temp/=10;
  	printf("%d",res/temp);
	return 0;
}