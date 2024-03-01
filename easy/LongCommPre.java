package easy;
import java.util.*;

public class LongCommPre {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length-1];
        for(int i = 0; i < (Math.min(first.length(), last.length())); i++) {
            if(first.charAt(i) != last.charAt(i)){
                return sb.toString();
            }
            sb = sb.append(first.charAt(i));
        }

        return sb.toString();
    }


    public static void main(String[] args) {

        LongCommPre lcp = new LongCommPre();
        String s = lcp.longestCommonPrefix(new String[]{"flower","flow","flight"});
        System.out.println(s);
        
    }
    
}
