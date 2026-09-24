class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for(String s:strs)
        {
            res.append(s.length()).append('#').append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> list=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            int j=i;
            while(str.charAt(j)!='#')
            {
                j++;
            }
            System.out.println(i+" "+j);
            int size=Integer.parseInt(str.substring(i,j));
            j++;
            list.add(str.substring(j,j+size));
            i=j-1+size;
        }
        return list;
    }
}
