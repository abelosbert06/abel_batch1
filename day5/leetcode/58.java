class Solution {

    public int lengthOfLastWord(String s) {
        var spaceStr = s.strip();
        int end = spaceStr.length() - 1;
        int count = 0;

        while (end >= 0) {
            if (spaceStr.charAt(end) == ' ') return count;

            count++;
            end--;
        }

        return count;
    }
}
