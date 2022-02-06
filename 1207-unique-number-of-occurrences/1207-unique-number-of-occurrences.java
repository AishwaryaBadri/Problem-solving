class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        boolean rtn=false;
        int occurances=0;
         Map<Integer, Integer> hm
            = new HashMap<Integer, Integer>();
        List<Integer> lst=new ArrayList<Integer>();
        
        for(int i=0; i<arr.length; i++)
        {
            occurances=0;
            for(int j=i+1; j<arr. length; j++)
            {
                if(arr[i]==arr[j])
                {
                    occurances++;
                }
            }
            if(hm.get(arr[i])==null)
            {
                hm.put(arr[i],occurances);
            }else
            {
                occurances= hm.get(arr[i])+occurances;
            }
            
        }
        
        for(Integer key :hm.keySet())
        {
            if(!lst.contains(hm.get(key)))
            {
                lst.add(hm.get(key));
                rtn=true;
            }else
            {
                rtn =false;
                break;
            }
            
        }
        
        return rtn;
    }
}