import java.util.Stack;

public class Solution {

    public int largestRectangleArea(int[] heights) {
        /**
         * Initializing variables
         */
        int maxArea = 0;
        /**
         * Here we store indecies of the height
         */
        Stack<Integer> stack = new Stack<>();
        /**
         * number of items in the histogram (length of the given array).
         */
        int n = heights.length;

        for (int i = 0; i < n; i++) {
            /**
             * i==n, this is the condition when we arrive at the last element, the put
             * height as 0 else take the current height
             */
            int currentHeight = (i == n) ? 0 : heights[i];
            /**
             * Check that currentHeight is less than the height value of the top of stack.
             * If this is the case, then we have to calculate the area.
             */
            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                /**
                 * height on the top of stack(index value store in the stack which is used to
                 * lookup the value of height in histogram)
                 */
                int height = heights[stack.pop()];
                /**
                 * i - stack.peek() - 1::: i=> currentHeight index
                 * stack.peek()=> What is on tp of the stack
                 * -1=>because arrays are 0 index based.
                 */
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                /**
                 * height * width=>This is the current area
                 */
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;

    }

}
