class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int matches=0;
         System.out.println("ruleKey"+ruleKey);
        for(int i=0; i< items.size() ; i++)
        {
          
              List<String> innerList=items.get(i);
           //   System.out.println("s-->"+s+"  s.equals(ruleValue)"+s.equals(ruleValue));
              if(ruleKey.equals("type"))
              {
                  System.out.println("type entry");
                  //check in 0 index
                  if(innerList.get(0).equals(ruleValue))
                  {
                      matches++;
                  }
              }else if(ruleKey.equals("color"))
              {
                 System.out.println("color entry");
                  if(innerList.get(1).equals(ruleValue))
                  {
                      matches++;
                  } 
              }else if(ruleKey.equals("name"))
              {
                  System.out.println("name entry");
                  if(innerList.get(2).equals(ruleValue))
                  {
                      matches++;
                  } 
                  
              }
              
          
        }
        return matches;
    }
}