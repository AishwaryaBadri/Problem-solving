class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        if(nums.length==1)
        {
            return nums[0];
        }
        int op=0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(map.get(nums[i])==null)
            {
                map.put(nums[i],1);
            }else
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        
       for(Map.Entry<Integer, Integer> entry: map.entrySet()) {

      
      if(entry.getValue() == 1) {
        System.out.println("The key for value "+ entry.getKey());
         op= entry.getKey();
        break;
      }
    }
        return op;
    }
    
    

    
}