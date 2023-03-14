import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Main
 * @Description: 括号生成
 * @author: sonnet
 * @date: 2023/3/14 17:15
 */


public class Main {
    List<String> list = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    public List<String> generateParenthesis(int n) {

        dfs(n,n,sb);
        return list;
    }

    public void dfs(int left,int right,StringBuilder sb){
        if(left == 0 && right == 0){
            list.add(sb.toString());
            return;
        }
        if(left > 0){
            dfs(left - 1,right,sb.append("("));
            sb.deleteCharAt(sb.length() - 1);
        }
        if(right > left){
            dfs(left,right - 1,sb.append(")"));
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
