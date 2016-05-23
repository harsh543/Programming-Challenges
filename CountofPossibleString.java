/* IMPORTANT: Multiple classes and nested static classes are supported */

 
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.lang.*;
class CountofPossibleString {
	
    
    static Boolean  checkPossibleRec(char set[], String prefix, int n, String p) {
         
        
 
       
        for (int i = 0; i < n; ++i) {
             
            // Next character of input added
            String newPrefix = prefix + set[i]; 
            if(newPrefix.equals(p))
              return true;
           
            checkPossibleRec(set, newPrefix, n, p); 
        }
        return false;
    }
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {     
line = br.readLine();
String splitLine[] = line.split(" ");
String s=splitLine[0];
String p=splitLine[1];
  int len = s.length(); 
  char[] charArray = s.toCharArray();
Boolean possib= checkPossibleRec(charArray, "", len, p);
 if(possib)
        System.out.println("Possible");
  else
    System.out.println("Impossible");
        }
        	
        }
}
