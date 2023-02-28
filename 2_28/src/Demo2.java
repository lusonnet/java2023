/**
 * @ClassName: Demo2
 * @Description: offer58
 * @author: sonnet
 * @date: 2023/2/28 16:37
 */


public class Demo2 {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0,n);
    }
}

