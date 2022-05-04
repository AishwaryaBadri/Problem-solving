class Solution {
    public int sumOfUnique(int[] nums) {
        List<Integer> lstNums=new ArrayList<>();
       Map<Integer,Integer> mapper=new HashMap<>();
        int sum=0;
        int count=0;
        for(int i=0;i< nums.length; i++)
        {
            if(mapper.get(nums[i])==null)
            {
                 mapper.put(nums[i],1);
            }else
            {
                count= mapper.get(nums[i]);
                mapper.put(nums[i],count+1);
            }
            
          
        }
        
        for (Integer key: mapper.keySet()) {
            if(mapper.get(key) == 1 )
            {
                sum=sum+key;
            }
        }
        return sum;

    }
    
    
}