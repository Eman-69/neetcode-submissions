class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int i=0;
        int maxCount=0;
        if(nums.length==0)
            return 0;

        while(i<nums.length-1)
        {
            if(nums[i+1]-nums[i]==1)
            {
                i++;
                if(count==0)
                count+=2;
                else
                    count++;
            }
            else if(nums[i+1]-nums[i]==0)
            {
                i++;
            }
            else{
                maxCount=Math.max(maxCount,count);
                count=0;
                i++;
            }
           // System.out.println(maxCount+" "+nums[i]+" "+i);
        }
        maxCount=Math.max(maxCount,count); 
        return maxCount==0?1:maxCount;
    }
}
