class Solution {
    public boolean backspaceCompare(String s, String t) {
        return getSanitizedString(s).equals(getSanitizedString(t));
    }

    public String getSanitizedString(String input) {
        int i=0,j=0;
        StringBuilder sb = new StringBuilder(input);
        while(j<input.length()) {
            if (input.charAt(j)!='#') {
                sb.insert(i, input.charAt(j));
                i++;
            } else {
                i = Math.max(0, i - 1);
            }
            j++;
        }
        return sb.substring(0, i).toString();
    }
}