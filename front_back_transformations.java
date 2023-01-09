//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.convert(S));
            
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String convert(String s) 
    { 
         StringBuilder str=new StringBuilder();

       for(int i=0;i<s.length();i++){

 

           if( s.charAt(i) >='a' &&  s.charAt(i) <='z'){

               str.append((char)('z'-( s.charAt(i)-'a')));

           }else{

                str.append((char)('Z'-( s.charAt(i)-'A')));

           }

       }

       return str.toString();
    }
} 
