//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String modify (String s)
    {
        // your code here
        ArrayList<Character> charList=new ArrayList<>();
        String res="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                charList.add(ch);
            }
        }
        Collections.reverse(charList);
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
             if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                res += charList.get(0);
                charList.remove(0);
            }else{
                res += ch;
            }
        }
        return res;
    }
}
