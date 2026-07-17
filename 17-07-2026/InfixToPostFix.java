import java.util.*;

public class InfixToPostfix {
    
    public static int rank(char op){
        if(op=='^') 
            return 3;
        else if(op=='*' || op=='/' || op=='%')
            return 2;
        
        else if(op=='+' || op=='-')
            return 1;
        else
            return -1;
    }
    
    public static String isInfixToPostfix(String s){
        Stack<Character> stack=new Stack<>();
        StringBuilder post=new StringBuilder();
        for(Character ch: s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                post.append(ch);
            }
            else if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                   post.append(stack.pop());
                }
                stack.pop();
            }
            else{
                while(!stack.isEmpty() 
                    && stack.peek()!='(' 
                    && rank(stack.peek())>=rank(ch)){
                        post.append(stack.pop());
                                        }
                stack.push(ch);
            }
        }
            while(!stack.isEmpty()){
                post.append(stack.pop());
            }
        
            return post.toString();
        
    }
    
    public static void main(String[] args) {
        String str="A+(B*C-(D/E^F)*G)*H";
        System.out.println(isInfixToPostfix(str));
    }

}
