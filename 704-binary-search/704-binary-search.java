class Solution {
    
    public int bsearch(int []nums ,int target, int s, int e){
        
        int m=s+(e-s)/2;
        
        if( s > e)
        {
            return -1;
        }
        
        if(nums[m]==target)
        {
            return m;
        }
        if(target < nums[m])
        {
            return bsearch(nums,target,s,m-1);
        }
        return bsearch(nums,target,m+1,e);
    }
    
    
    
    public int search(int[] nums, int target) {
        int e=nums.length-1;
        int s=0;
        int index= bsearch (nums,target,s,e);
        
        return index;
    }
    
}