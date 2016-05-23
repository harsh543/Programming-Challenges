 import java.util.Scanner;
 

 

class minDiffRod {
	// A utility function to get the maximum of two integers
static int min(int a, int b) { return (a < b)? a : b;}
static int min(int a, int b, int c) { return min(a, min(b, c));}
/* Returns the best obtainable price for a rod of length n and
   price[] as prices of different pieces */
 static int minDiff(int n)
{
    // Base cases
    if (n == 0) return 0;
 int t;
int cnt=0;
 if(n == 1) return cnt-1;
    // Make a cut at different places and take the maximum of all
    int min_val = 99999;
    
    for (int i = 1; i < n; i++)
      { 
      	t=min_val;
      	min_val = min(min_val, (n-i)-i, minDiff((n-i)-i));
      if(t!=min_val)
      cnt++;
      
      	
      }
    // Return the maximum of all values
    return cnt-1;
}
 
    public static void main(String args[] ) throws Exception {
      // A Dynamic Programming solution for Rod cutting problem
 int n,l;
    Scanner in = new Scanner(System.in);
    n=in.nextInt();
for(int i=0;i<n;i++){
	l=in.nextInt();

        System.out.println(minDiff(l));
    }
}
}
