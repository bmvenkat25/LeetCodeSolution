package IndexOfFirstOccurance;

public class IndexOfFirstOccurance {
    public int strStr(String haystack, String needle) {
        int k = -1;
        if(haystack.contains(needle))
            k = haystack.indexOf(needle);
        return k;
    }
}
