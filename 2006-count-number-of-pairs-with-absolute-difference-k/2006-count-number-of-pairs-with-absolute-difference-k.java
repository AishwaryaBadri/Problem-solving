class Solution {
    public int countKDifference(int[] nums, int k) {
        int numberOfPairs=0;
        int n=0;
        for(int i=0;i< nums.length;i++)
        {
            for(int j=i+1; j<nums.length;j++)
            {
               // n= nums[i]-nums[j];
                if(Math.abs(nums[i]-nums[j])==k)
                {
                   numberOfPairs++; 
                }
            }
        }
        return numberOfPairs;
    }
}