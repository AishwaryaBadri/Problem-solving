class Solution {
    public int pivotIndex(int[] nums) {
        int sum =0;
        int totalSum=0;
        
        for(int i=0; i < nums.length;i++)
        {
            totalSum=totalSum+nums[i];
          
        }
        
        for(int i=0; i < nums.length;i++)
        {
            
            if(sum==totalSum-sum-nums[i])
            {
                return i;
            }
         sum+=nums[i];
        }
        
        return -1;
    }
}