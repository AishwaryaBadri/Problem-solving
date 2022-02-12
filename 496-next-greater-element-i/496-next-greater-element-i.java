class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int [] ans= new int[nums1.length];
        int nextmax=0;
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j< nums2.length;j++)
            {
                if(nums2[j]==nums1[i])
                {
                    System.out.println("j-->"+j);
                     int[] subArray; 
                  if(j+1 >= nums2.length-1)
                  {
                     
                       subArray= new int[1];
                      subArray[0]=nums2[nums2.length-1];
                  }else
                  {
                      //subArray= Arrays.copyOfRange(nums2, j+1, nums2.length-1);
                      subArray= Arrays.copyOfRange(nums2, j+1, nums2.length);
                  }
                       
                   System.out.println("subArray->"+subArray);
              
                    
                    for(int k=0; k< subArray.length;k++)
                    {
                        
                        if(subArray[k] > nums2[j])
                        {
                           nextmax= subArray[k];
                            break;
                        }else
                        {
                            nextmax=-1;
                            
                        }
                    }
                    
                   
                    break;
                  
                  
                }
            }
           ans[i]=nextmax;
        }
       return ans; 
    }
}