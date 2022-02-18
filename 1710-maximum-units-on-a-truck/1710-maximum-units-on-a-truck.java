class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
     // Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]); // b[1] - a[1] may cause int overflow, credit to @Zudas.
        
	    Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
       //   [[5,10],[3,9],[4,7],[2,5]]
        int boxes = 0;
        
        for(int [] box : boxTypes)
        {
            if(truckSize >= box[0])
            {
                boxes += box[0] * box[1];
                truckSize= truckSize-box[0];
                
            }else
            {
                boxes += truckSize *box[1];
                break;
            }
        }
       
        return boxes;
    }
}