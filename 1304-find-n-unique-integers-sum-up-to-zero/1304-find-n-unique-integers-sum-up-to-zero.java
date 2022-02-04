class Solution {
    public int[] sumZero(int n) {
        
        int[] ans=new int[n];
       
        int temp=0;
        
           
        
            for(int i=0;i<n;i++)
        {
            if(n%2!=0)
            {
                if(n-i==n)
                {
                    ans[i]=0;
                }else
                {
                   if(i%2==0)
                   {
                       ans[i]= -i+1;
                   }else
                   {
                         ans[i]= i;
                   }
                   
                }
                
               
            }else
            {
                if(i%2==0)
                  {
                       
                    ans[i]= i+1;
                      temp=i+1;
                  }else
                       {
                              ans[i]= -temp;
                       }
                
            }
            
        } 
       
        
        return ans;
    }
}