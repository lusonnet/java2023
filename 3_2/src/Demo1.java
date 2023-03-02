/**
 * @ClassName: Demo1
 * @Description: offer 53
 * @author: sonnet
 * @date: 2023/3/2 18:34
 */


public class Demo1 {
}
class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0)return 0;
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while(left < right){
            int mid = (left + right) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }
            if(nums[mid] >= target){
                right = mid;
            }
        }
        while(left < nums.length && nums[left] == target){
            count++;
            left++;
        }
        return count;
    }
}
