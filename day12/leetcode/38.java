class Solution {
    public String countAndSay(int n) {
        if (n <= 0) return "";
        String res = "1";
        
        for (int i = 1; i < n; i++) {
            res = rle(res);
        }

        return res;
    }

    public static String rle(String s) {
        StringBuilder sb = new StringBuilder();
        char curr = s.charAt(0);
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == curr) {
                count++;
            } else {
                sb.append(count).append(curr);
                curr = s.charAt(i);
                count = 1; 
            }
        }

        sb.append(count).append(curr);

        return sb.toString();
    }
}
