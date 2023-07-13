public class Pattern132 {
    public static boolean find132pattern(int[] nums) {
        if (nums.length < 3) {
            return false;
        }

        int n = nums.length;
        int[] minValues = new int[n];
        minValues[0] = nums[0];

        for (int i = 1; i < n; i++) {
            minValues[i] = Math.min(minValues[i - 1], nums[i]);
        }

        Stack<Integer> stack = new Stack<>();
        for (int j = n - 1; j >= 0; j--) {
            if (nums[j] > minValues[j]) {
                while (!stack.isEmpty() && stack.peek() <= minValues[j]) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() < nums[j]) {
                    return true;
                }
                stack.push(nums[j]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        boolean has132pattern = find132pattern(nums);
        System.out.println("Contains 132 pattern: " + has132pattern);
    }
}
