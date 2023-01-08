//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t-- > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            List<String> ans = ob.splitString(S);
            for (String val: ans) 
                if(val == "")
                    System.out.println(-1); 
                else    
                    System.out.println(val); 
        }
    } 
} 


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static List<String> splitString(String S) 
    { 
        // code here 
         ArrayList<String> arrs = new ArrayList<>();
          String s1="";
          String s2="";
          String s3="";
       for(int i=0; i<S.length() ; i++){
           char ch = S.charAt(i);
           if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
               s1 = s1 + ch;
           }
           else if(ch>='0' && ch<='9'){
               s2 = s2 +ch;
           }
           else{
               s3 = s3 + ch;
           }
       }
       arrs.add(s1);
       arrs.add(s2);
       arrs.add(s3);
       return arrs;
    }
} 
