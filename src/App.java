import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Given an array of integers heights representing the histogram's bar height
         * where the width of each bar is 1, return the area of the largest rectangle in
         * the histogram.
         * 
         * 
         * 
         * Example 1:
         * 
         * Input: heights = [2,1,5,6,2,3]
         * Output: 10
         * Explanation: The above is a histogram where width of each bar is 1.
         * The largest rectangle is shown in the red area, which has an area = 10 units.
         * 
         * Example 2:
         * 
         * Input: heights = [2,4]
         * Output: 4
         * 
         */
        int[] heights = { 2, 1, 5, 6, 2, 3 };
        Solution solution = new Solution();
        int result = solution.largestRectangleArea(heights);
        System.out.println("The given values are: " + Arrays.toString(heights) + " and the result is: " + result);
    }
}
