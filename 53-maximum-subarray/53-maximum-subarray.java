class Solution {
    public int maxSubArray(int[] nums) {
        //Uisng kandane's algorithm
        
        int currSubArray= nums[0];
        int maxSubArray=nums[0];
        
        for(int i=1; i < nums.length; i++)
        {
            int num= nums[i];
            currSubArray= Math.max(num, currSubArray+num);
            maxSubArray= Math.max(currSubArray,maxSubArray);
        }
        return maxSubArray;
        
    }
}