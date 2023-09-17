package LongestCommonPrefix;

public class LongestCommonPrefixSolution {
    public static String longestCommonPrefix(String[] strs) {
        String res = "";
        for(int i=0;i<strs[0].length();i++) {
            int flag = 0 ;
            char x = strs[0].charAt(i);
            for(int j=0;j<strs.length;j++) {
                if(i < strs[j].length() && x == strs[j].charAt(i))
                    flag++;
                else
                    break;
            }
            if(flag == strs.length)
                res+=x;
            else
                break;
        }
        return res;
    }
}
