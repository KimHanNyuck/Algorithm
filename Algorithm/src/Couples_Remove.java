import java.util.Stack;

public class Couples_Remove {
	public int solution(String s) {
        Stack<String> stack = new Stack<String>();
        for(int i = 0 ; i < s.length() ; i++) {
        	if(!stack.isEmpty()) {
        		String word = stack.peek();
        		if(word.equals(String.valueOf(s.charAt(i)))) {
        			stack.pop();
        		} else {
        			stack.push(String.valueOf(s.charAt(i)));
        		}
        	} else {
        		stack.push(String.valueOf(s.charAt(i)));
        	}
        }
        return stack.size() == 0 ? 1 : 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
