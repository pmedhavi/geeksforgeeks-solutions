//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		int[] res = new Sol().count (s);
    		
    		for (int i = 0; i < 4; i++)
    		    System.out.println (res[i]);
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int[] count (String s)
    {
        // your code here       
        int up=0,l=0,n=0,sp=0;
        for(char ch: s.toCharArray())
        {
            if(ch>='A'&&ch<='Z')
            up++;
            else if(ch>='a'&&ch<='z')
            l++;
            else if(ch>='0'&&ch<='9')
            n++;
            else
            sp++;
        }
        return new int[]{up,l,n,sp};
    }
}
