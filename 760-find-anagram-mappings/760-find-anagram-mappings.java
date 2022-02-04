class Solution {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        //Identify in which position nums[1] occurs in nums[2]
        int [] mapping=new int[nums1.length];
        
        for(int i=0;i< nums1.length; i++)
        {
            innerloop : for(int j=0; j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                     mapping[i]=j;
                    break innerloop;
                }
            }
           
        }
        return mapping;
        
    }
}