/**
 * @ClassName: Demo2
 * @Description: 盛最多水的容器
 * @author: sonnet
 * @date: 2023/3/8 18:20
 */


public class Demo2 {
    public int maxArea(int[] height) {
        int i = 0,j = height.length - 1;
        int num = 0;
        while(i < j){
            num = Math.max(num,Math.min(height[i],height[j]) * (j-i));
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return num;
    }
}
