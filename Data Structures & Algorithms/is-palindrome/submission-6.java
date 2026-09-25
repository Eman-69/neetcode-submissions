class Solution {
    public boolean isPalindrome(String s) {
        char[] str=s.toLowerCase().toCharArray();
        int l=0;
        int r=str.length-1;
        while(l<r)
        {
            while(!Character.isLetterOrDigit(str[l])&&l<r)
                l++;
            while(!Character.isLetterOrDigit(str[r])&&l<r)
                r--;     
            System.out.println(str[l]+" "+str[r]);
            if(str[l]!=str[r])
                return false;
            l++;
            r--;
        }
        return true;
    }
}
