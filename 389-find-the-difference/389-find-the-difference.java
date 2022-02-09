class Solution {
    public char findTheDifference(String s, String t) {
        
        char [] chS= s.toCharArray();
        char [] chT=t.toCharArray();
       
        Arrays.sort(chS);
        Arrays.sort(chT);
        int i=0;
        while (i < s.length()) {
           
            if (chS[i] != chT[i]) {
               
                return chT[i];
            }
            i += 1;
               
        }
        
     
      return chT[i];  
    }
}