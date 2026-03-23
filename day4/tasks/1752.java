class Solution {
    public boolean check(int[] n) {
        int c = 0;
        int len = n.length;

        for (int i = 0; i < len; i++) {
            if (n[i] > n[(i + 1) % len]) {
                c++;
            }
        }

        return c <= 1;
    }
}
