class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int busystudent =0;
        int n=startTime.length;
        int i=0;
        while(i < n)
        {
            if(startTime[i] <= queryTime && queryTime <= endTime[i])
            {
                busystudent++;
            }
            
            i++;
            
        }
            
        return busystudent;
    }
}