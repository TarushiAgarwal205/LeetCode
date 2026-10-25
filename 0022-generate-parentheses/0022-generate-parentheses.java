
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll = new ArrayList<>();
        parenthesis(n, 0, 0, "", ll);
        return ll;
    }

    public void parenthesis(int n, int open, int close, String ans, List<String> ll) {
        if (open == n && close == n) {
            ll.add(ans);
            return;
        }

        if (open > n || close > open) {
            return;
        }

        parenthesis(n, open + 1, close, ans + "(", ll);
        parenthesis(n, open, close + 1, ans + ")", ll);
    }
}
