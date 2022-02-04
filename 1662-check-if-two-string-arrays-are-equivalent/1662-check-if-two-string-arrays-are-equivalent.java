class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String concat1="";
         String concat2="";
        boolean rtn=false;
        for(String s: word1)
        {
            concat1=concat1+s;
        }
         for(String s: word2)
        {
            concat2=concat2+s;
        }
        
        if(concat1.equals(concat2))
        {
            rtn=true;
        }
        return rtn;
    }
}