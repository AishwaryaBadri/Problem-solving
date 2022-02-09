class Solution {
    public int addDigits(int num) {
        
        int len= String.valueOf(num).length();
       
        int sum=0;
        String [] s=(String.valueOf(num)).split("");
        if(len > 1)
        {
            while (len > 1)
            {   
                sum=0;
                for(int i=0; i< len; i++)
                { 
                    
                    sum= sum +  Integer.valueOf(s[i]);
                }
                 s=(String.valueOf(sum)).split("");
                 len=String.valueOf(sum).length();
            }
            
        }else
        {
            sum=num;
        }
        
        return sum;
    }
}