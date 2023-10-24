class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder res = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1;i>=0;i--) {
            if (s.charAt(i) != '-') {
                sb.append(s.charAt(i));
            }
            if (sb.length() == k) {
                res.append(sb.toString() + "-");
                sb.delete(0,sb.length());
            }
        }
        res.append(sb.toString());
        if (res.length() > 0 && res.charAt(res.length()-1) == '-') {
            res.delete(res.length()-1, res.length());
        } 
        return res.reverse().toString().toUpperCase();
    }
}