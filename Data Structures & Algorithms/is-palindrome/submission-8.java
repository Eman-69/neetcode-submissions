class Solution {
    public boolean isPalindrome(String s) {
        char[] str=s.toLowerCase().toCharArray();
        int l=0;
        int r=str.length-1;
        while(l<r)
        {
            while(!alphaNum(str[l])&&l<r)
                l++;
            while(!alphaNum(str[r])&&l<r)
                r--;     
            System.out.println(str[l]+" "+str[r]);
            if(str[l]!=str[r])
                return false;
            l++;
            r--;
        }
        return true;
    }
    public boolean alphaNum(char c)
    {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}
