class Solution {
    public boolean checkString(String s) {
        return s.indexOf('b') == -1 || (s.lastIndexOf('a') < s.indexOf('b'));
    }
}