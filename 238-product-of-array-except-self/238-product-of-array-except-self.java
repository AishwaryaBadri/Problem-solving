class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] res= new int[nums.length];
        int j =0;
        int k =0;
        int left=1;
        int right=1;
        for(int i =0; i< nums.length; i++)
        {
           if(i > 0)
           {
               left=left * nums[i-1];
           }
            res[i]= left;
            
        }
        
        for(int i =nums.length-1;i >=0;i--)
        {
           if(i < nums.length-1)
           {
               right = right * nums[i+1];
           }
            res[i]*= right;
        }
     return res;   
    }
}