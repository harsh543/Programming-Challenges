#include <stdio.h>
#include <string.h>
int longestnonPalSubstr(char *str)
{
    int maxLength = 0;  // The result (length of LPS)
 
    int start = 0;
    int len = strlen(str);
 
    int low, high,i;
  
    for (i = 1; i < len; ++i)
    {
        
        low = i - 1;
        high = i;
        while (low >= 0 && high < len && str[low] != str[high])
        {
            if (high - low + 1 > maxLength)
            {
                start = low;
                maxLength = high - low + 1;
            }
            --low;
            ++high;
        }
  
        low = i - 1;
        high = i + 1;
        while (low >= 0 && high < len && str[low] != str[high])
        {
            if (high - low + 1 > maxLength)
            {
                start = low;
                maxLength = high - low + 1;
            }
            --low;
            ++high;
        }
    }
  
    return maxLength;
}
int main()
{
   char s[1000000];
   int count;
  scanf("%s",s);
   count= longestnonPalSubstr(s);
    printf("%d",count);
     
}
