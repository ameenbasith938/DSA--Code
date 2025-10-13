import java.util.*;

class Solution {
    private boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] count = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for (int c : count) if (c != 0) return false;
        return true;
    }
    public List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<>();
        if (words.length == 0) return result;
        result.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (!isAnagram(words[i], result.get(result.size() - 1))) {
                result.add(words[i]);
            }
        }

        return result;
    }
}
