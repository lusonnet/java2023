import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Demo1
 * @Description: 电话号码的字母组合
 * @author: sonnet
 * @date: 2023/3/12 22:00
 */


public class Demo1 {
    List<String> list = new ArrayList<>();//保存结果
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0 || digits == null)return list;
        String[] num = {"xxx","xxx","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backTracking(digits,num,0);
        return list;

    }
    public abstract class exam{//抽象类
        //里面不实现具体的内容，供子类实现

    }
    StringBuilder temp = new StringBuilder();
    public void backTracking(String digits,String[] num,int key){
        if(key == digits.length()){
            list.add(temp.toString());
            return;
        }

        String str = num[digits.charAt(key) - '0'];
        for(int i = 0;i < str.length();i++){
            temp.append(str.charAt(i));//'a'
            backTracking(digits,num,key + 1);//'b','d'
            temp.deleteCharAt(temp.length() - 1);//删除刚才的'd'，继续查看'e'


        }
    }
}

