class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int count=0;
        boolean bl=false;
        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        for(String s : words)
        {
            bl=false;
            for(char ch : s.toCharArray())
            {
                //check if allowed  each char of string is present in allowed words. if no t present exit the current loop.
                if(!allowed.contains(String.valueOf(ch)))
                {
                    bl=true;
                    break;
                }
            }
            if(!bl)
                count++;
        }
        return count;
    }
}