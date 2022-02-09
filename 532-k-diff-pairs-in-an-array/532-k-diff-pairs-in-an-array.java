class Solution {
    public int findPairs(int[] nums, int k) {
        
        Arrays.sort(nums);
       int count=0;
        String s="";
       List<String> stList=new ArrayList<String>();
        for(int i =0; i< nums.length; i++)
        {
            for(int j=i+1; j<nums.length; j++)
            {
                if(Math.abs(nums[j]-nums[i])==k)
                {
                   
                    s=nums[i] + ","+nums[j];
                    if(!stList.contains(s))
                    {
                        stList.add(s);
                        count++;
                    }
                    
                }
            }
        }
      return count;  
    }
}