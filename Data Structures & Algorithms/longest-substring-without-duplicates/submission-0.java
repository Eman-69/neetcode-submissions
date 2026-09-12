class Solution {
    public int lengthOfLongestSubstring(String s) {
        int begin=0;
        int end=0;
        int maxSum=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(end<s.length())
        {
            char curr=s.charAt(end);
            int last=map.getOrDefault(curr,-1);
            if(last>=begin&&map.containsKey(curr))
            {
                begin=last+1;
            }

            map.put(curr,end);
            maxSum=Math.max(maxSum,end-begin+1);
            end++;
        }
        return maxSum;
    }
}

