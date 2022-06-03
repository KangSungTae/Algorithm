import java.util.Stack;

public class CoupleWordRemove {

	public static void main(String[] args) {

		String input = "abcda";
		int result = 1;

		System.out.println(solution(input));

	}

	public static int solution(String s)
    {
        int answer = -1;
        
        Stack<Character> stack = new Stack<Character>();
        
        
        for(int i = 0 ; i < s.length() ; i ++) {
        	
        	if(stack.isEmpty() && i < s.length()) {
        		stack.add(s.charAt(i));
        	}else if(stack.peek().equals(s.charAt(i))){
        		stack.pop();
        	}else {
        		stack.add(s.charAt(i));
        	}
        	
        }
        
        if(stack.isEmpty()) {
        	answer = 1;
        }else {
        	answer = 0;
        }
        
        return answer;
    }
}
