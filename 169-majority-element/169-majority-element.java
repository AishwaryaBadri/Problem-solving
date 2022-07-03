class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> hmap=new HashMap<Integer,Integer>();
        int op=0;
        int val=0;
        for(int i=0; i<nums.length; i++)
        {
           if(hmap.get(nums[i])!=null)
           {
               hmap.put(nums[i],hmap.get(nums[i])+1);
           }else
           {
               hmap.put(nums[i],1);
           }
                
                
        }     
        
      for(Map.Entry<Integer, Integer>  entry : hmap.entrySet())
        {
           if(entry.getValue() > val)
           {
               val=entry.getValue();
               op=entry.getKey();
           }
                
                
        }  
        return op;
    }
}