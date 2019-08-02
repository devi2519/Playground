#include<stdio.h>
int main()
{
  char ch;
 
  scanf("%c", &ch);
 
  // Checking both lower and upper case
 
  if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch =='o' || ch=='O' || ch == 'u' || ch == 'U')
    printf("Vowel", ch);
  else
    printf("Consonant", ch);
     
  return 0;
}
  //type your code here
 