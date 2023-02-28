/**
 * @ClassName: Demo1
 * @Description: offer05
 * @author: sonnet
 * @date: 2023/2/28 16:24
 */


public class Demo1 {
}
class Solution {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == ' '){
                sb.append("%20");
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();//StringBuilder转为String
    }
}