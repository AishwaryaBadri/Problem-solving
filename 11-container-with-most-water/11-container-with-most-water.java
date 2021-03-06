class Solution {
    public int maxArea(int[] height) {
       
        // area= limiting height * width
         //move the pointer with lesser height
        int left = 0;
        int right= height.length-1;
        int maxarea=0;
        int width =0;
    while(left < right)
    {
        width=right-left;
        maxarea= Math.max(maxarea,width * Math.min(height[left],height[right]));
        if(height[left] <= height[right])
        {
             left++;
        }else
        {
           
            right--;
        }
        
    }
       return maxarea; 
    }
}