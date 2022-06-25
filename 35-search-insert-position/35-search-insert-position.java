class Solution {
    public int searchInsert(int[] nums, int target) {
        //use binary search 
        int index=-1;
        int start=0;
        int end= nums.length-1;
        
        while(start <= end)
        {
            int mid=end + (start - end) / 2;
            if(nums[mid]==target)
            {
                return mid;
                // [1,3,5,6], target = 3 mid=5
            }else if(nums[mid] > target)
            {
                
                end=mid-1;
            }else if(nums[mid] < target)
            {
                start =mid+1;
            }
                
        }
        if(nums[0] > target )
        {
            return 0;
            
        }else if(nums[nums.length-1] < target)
        {
            return nums.length;
        }
        for(int i=0; i < nums.length-1; i++)
        {
            if(nums[i] < target &&  nums[i+1] > target)
            {
                return i+1;
                
            }
        }
        return -1;
    }
}