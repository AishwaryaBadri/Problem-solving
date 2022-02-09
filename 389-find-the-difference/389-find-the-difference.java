class Solution {
    public char findTheDifference(String s, String t) {
        
        char [] chS= s.toCharArray();
        char [] chT=t.toCharArray();
       
        Arrays.sort(chS);
        Arrays.sort(chT);
        int i=0;
        while (i < s.length()) {
            System.out.println("chS[i]-->"+chS[i]+" chT[i]==>"+chT[i]);
            if (chS[i] != chT[i]) {
                System.out.println(" INSIDE chS[i]-->"+chS[i]+" chT[i]==>"+chT[i]);
                return chT[i];
            }
            i += 1;
               System.out.println(" INSIDE I"+ i);
        }
        
     
      return chT[i];  
    }
}