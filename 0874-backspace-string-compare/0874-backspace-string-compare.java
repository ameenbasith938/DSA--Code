class Solution {
    public boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }

    private String buildString(String st) {
        StringBuilder result = new StringBuilder();

        for (char ch : st.toCharArray()) { // use 'st' here
            if (ch == '#') {
                if (result.length() > 0) {
                    result.deleteCharAt(result.length() - 1);
                }
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }
}
