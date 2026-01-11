class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    void dfs(int[] c, int t, int i, List<Integer> cur, List<List<Integer>> res) {
        if (t == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if (t < 0 || i == c.length) return;

        cur.add(c[i]);
        dfs(c, t - c[i], i, cur, res);
        cur.remove(cur.size() - 1);

        dfs(c, t, i + 1, cur, res);
    }
}
