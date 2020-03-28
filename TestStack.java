package JavaStudy;

import java.util.Stack;

public class TestStack {
    public boolean isValid(String s) {
        //先创建一个栈
        Stack<Character> stack = new Stack<>();
        //循环遍历字符串中的每个元素
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //判定c是否是左括号，如果是就入栈
            if (c == '(' || c == '[' || c == '{') {    //在java中如果是char类型就用' ',如果是String类型就用“ ”
                stack.push(c);
                continue;//进入下一次循环，取出下一个字符
            }
            //如果当前字符不是左括号，栈又为空，此时这个字符也是非法的
            if (stack.empty()) {
                return false;
            }
            //判定c是否是右括号，如果是就取出栈顶元素进行对比
            char top = stack.pop();
            //三种合法情况
            if (top == '(' && c == ')') {
                continue;
            }
            if (top == '[' && c == ']') {
                continue;
            }
            if (top == '{' && c == '}') {
                continue;
            }
            //除了上面三种合法情况，其他的都是非法情况
            return false;
        }
        //遍历完字符串还得看一下栈中是否为空，为空才是合法的
        if (stack.empty()) {
            return true;
        }
        //否则就是非法的
        return false;
    }
}
