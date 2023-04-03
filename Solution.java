import java.util.ArrayList;
import java.util.List;

class Solution {
    public char findTheDifference(String s, String t) {

        List<Character> sList = new ArrayList<>();
        List<Character> tList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            sList.add(s.charAt(i));
        }
        for (int i = 0; i < t.length(); i++) {
            tList.add(t.charAt(i));
        }

        for (int i = sList.size()-1; i >=0; i--) {
            if (tList.contains(sList.get(i)))
                tList.remove(sList.get(i));
        }

        return tList.get(0);
    }
}