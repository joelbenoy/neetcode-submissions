class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int l = 0, r = s.length() - 1;
        char[] sc = s.toCharArray();
        while (l < r) {
            if (sc[l++] != sc[r--])
                return false;
        }
        return true;
    }
}
