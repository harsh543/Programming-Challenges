/* IMPORTANT: Multiple classes and nested static classes are supported */

 
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.lang.*;
class CountofPossibleString {
	
    
   
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
Boolean flagg=false;
 for(int i=0;i<p.length()-s.length();i++){
           			String temp=s.substring(0,i)+s+s.substring(i,s.length());
           			if(temp.trim().equals(p))flag=true;
           		}
 
 if(flag)
        System.out.println("Possible");
  else
    System.out.println("Impossible");
        }
        	
        }
}
