class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int ops = 0;

        for (int x : nums) {
            // Remove all heights larger than x (they would have been peeled off)
            while (!stack.isEmpty() && stack.peek() > x) {
                stack.pop();
            }

            // If x introduces a new height > 0
            if (x > 0 && (stack.isEmpty() || stack.peek() < x)) {
                ops++;
                stack.push(x);
            }
        }

        return ops;
    }
}
