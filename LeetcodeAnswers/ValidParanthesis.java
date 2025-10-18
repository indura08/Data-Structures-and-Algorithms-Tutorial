package LeetcodeAnswers;

import java.util.Stack;

public class ValidParanthesis {

    public static boolean isValid(String s){

        if(s.length() < 100000){
            Stack<Character> stack1 = new Stack<>();
            Stack<Character> stackTemp = new Stack<>();

            for (char c : s.toCharArray()){
                if(c =='{' || c =='[' || c == '('){
                    stack1.push(c);
                }

                else if(c =='}' || c ==']' || c == ')'){
                    if(stack1.empty()){
                        return false;
                    }

                    if(c == '}' && stack1.peek() == '{'){
                        stack1.pop();
                    }
                    else if(c == ']' && stack1.peek() == '['){
                        stack1.pop();
                    }
                    else if(c == ')' && stack1.peek() == '('){
                        stack1.pop();
                    }else {
                        stackTemp.push(c);
                    }

                }
            }

            if(stack1.empty() && stackTemp.isEmpty()){
                return true;
            }
            else {
                return false;
            }


        }
        else {
            System.out.println("Your stack has more than 10000 characters");
            return false;

        }

    }

    public static void main(String[] args) {
        System.out.println(isValid("(])"));
    }
}
