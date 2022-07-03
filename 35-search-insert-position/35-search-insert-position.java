class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0;
        int end = nums.length-1;
        int mid=0;
        
        while(start <=end)
        {
            mid= end+(start-end)/2;
            
            if(nums[mid]==target)
            {
                return mid;
            }else if(nums[mid] > target)
            {
                end=mid-1;
            }else if(nums[mid] < target)
            {
                start=mid+1;
            }
        }
        
        
        for(int i=0; i< nums.length-1;i++)
        {
            if(nums[i] < target && nums[i+1] >target )
            {
                return i +1;
            }
        }
        if(nums[0]> target)
        {
            return 0;
        }else if(nums[nums.length-1] < target)
        {
            return nums.length;
        }
        return -1;
    }
}