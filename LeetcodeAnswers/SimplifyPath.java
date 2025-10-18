package LeetcodeAnswers;

import java.util.Stack;

public class SimplifyPath {

    public static String simplifyPath(String path){

        Stack<String> stack1 = new Stack<>();
        String[] strings = path.split("/");
        StringBuilder conPath = new StringBuilder();

        if(path.length() <= 3000 && !path.isEmpty() && path.charAt(0) == '/'){

            for(int i = 0; i <= strings.length - 1 ; i++){

                if(strings[i].equals(".")){
                    continue;
                } else if (strings[i].equals("..")){
                    if(!stack1.isEmpty()){
                        stack1.pop();
                    }
                }
                else if(!strings[i].isEmpty()) {
                    stack1.push(strings[i]);

                }
            }
        }

        for(String s : stack1){
            conPath.append("/").append(s);
        }

        return conPath.isEmpty() ? "/" : conPath.toString();
    }

    public static void main(String[] args) {

        String path = "/.../a/../b/c/../d/./";
        System.out.println(simplifyPath(path));
    }
}
