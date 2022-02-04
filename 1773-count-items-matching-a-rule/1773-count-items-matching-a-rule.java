class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int matches=0;
       
        for(int i=0; i< items.size() ; i++)
        {
          
             
            
           //   System.out.println("s-->"+s+"  s.equals(ruleValue)"+s.equals(ruleValue));
              if(ruleKey.equals("type") && items.get(i).get(0).equals(ruleValue))
              {
                 
                  matches++;
                  
              }else if(ruleKey.equals("color")  && items.get(i).get(1).equals(ruleValue))
              {
                
                  
                      matches++;
                  
              }else if(ruleKey.equals("name")  && items.get(i).get(2).equals(ruleValue))
              {
                  
                  
                      matches++;
                   
                  
              }
              
         
        }
        return matches;
    }
}