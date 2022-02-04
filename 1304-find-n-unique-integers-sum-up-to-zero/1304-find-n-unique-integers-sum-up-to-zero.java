class Solution {
    public int[] sumZero(int n) {
        
        int[] ans=new int[n];
        boolean isEve=false;
        int temp=0;
        if(n%2==0)
        {
            isEve=true;
        }
           
        if(n%2!=0)
        {
            for(int i=0;i<n;i++)
        {
            if(!isEve)
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
                
               
            }
            
        } 
        }else
        {
            for(int i=0;i<n;i++)
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