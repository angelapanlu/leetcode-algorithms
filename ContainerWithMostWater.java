/*Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
*/


class ContainterWithMostWater {
    public int maxArea(int[] height) {
        int len = height.length;
        int start = 0, end = len-1;
        int maxArea = 0;
        while (start < end) {
            int area = (end - start) * Math.min(height[start], height[end]);
            maxArea = Math.max(maxArea, area);
            if (height[start] <= height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxArea;
    }
}
