class Solution {
public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> outer = new ArrayList<>();
   // Arrays.sort(nums);
    
    outer.add(new ArrayList<>());
    for(Integer num:nums)
    {
        int n=outer.size();
        for(int i=0;i< n; i++)
        {
            List<Integer> internal = new ArrayList<>(outer.get(i));
            internal.add(num);
            outer.add(internal);
        }
    }
    
  
    return outer;
}


}