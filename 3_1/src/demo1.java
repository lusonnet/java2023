import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: demo1
 * @Description:03
 * @author: sonnet
 * @date: 2023/3/1 23:56
 */


public class demo1 {
}
class Solution {
    public int findRepeatNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)) return num;
            map.put(num, 1);
        }
        return -1;
    }
}