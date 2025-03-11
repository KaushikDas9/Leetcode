
class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int a = 0;
        int b = 0;

        while (b < s.length && a < g.length) {
            if (s[b] >= g[a]) {
                a++;
            }
            b++;
        }
        return a;
    }
}