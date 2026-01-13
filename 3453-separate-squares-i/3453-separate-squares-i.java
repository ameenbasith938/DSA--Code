class Solution {
    public double separateSquares(int[][] squares) {
        double low = 1e18, high = 0;

        for (int[] s : squares) {
            low = Math.min(low, s[1]);
            high = Math.max(high, s[1] + s[2]);
        }

        for (int i = 0; i < 60; i++) {
            double mid = (low + high) / 2;
            double below = 0, above = 0;

            for (int[] s : squares) {
                double y = s[1], l = s[2];
                if (mid <= y) {
                    above += l * l;
                } else if (mid >= y + l) {
                    below += l * l;
                } else {
                    below += l * (mid - y);
                    above += l * (y + l - mid);
                }
            }

            if (below < above) low = mid;
            else high = mid;
        }
        return low;
    }
}
