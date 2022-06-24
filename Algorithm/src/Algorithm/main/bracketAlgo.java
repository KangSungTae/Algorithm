package Algorithm.main;
import java.util.Stack;

public class bracketAlgo {

	public static void main(String[] args) {
		
		/* input 값 a 가 좌측으로 length 만큼 이동할때 완벽한 문자열이 되는 개수를 구하라.*/
		/* java.util 의 stack 은 push , pop(값 호출 후 제거) , peek(값 확인) 3가지로 나누어져 있음. */
		 
		String b = "{{{{{{{";
//		checkCorrect(b);
//		solution(a);
		System.out.println(""+solution(b));
	}
	
	/* 좌측으로 i칸씩 이동하며 완벽한 문자열을 찾는 함수를 호출 */
    public static int solution(String s) {
        int answer = 0;
        
        for(int i = 0 ; i < s.length() ; i ++) {
        	/* 좌측으로 i칸씩 */
        	String k = s.substring(i, s.length()) + s.substring(0,i);
            if(checkCorrect(k)) {
            	answer += 1;
            }
        }

        return answer;
    }
    
    /* 완벽한 문자열 check 함수. */
    public static boolean checkCorrect(String s) {
		/* stack 을 활용하여 구현이 가능 */
    	
    	Stack<Object> stack = new Stack<Object>();
    	
    	for(int i = 0 ; i < s.length() ; i ++) {
    		switch (s.charAt(i)) {
			case '}' : {
				try{
					if(stack.peek().equals('{')) {
						stack.pop();
						break;
					}else {
						return false;
					}
				}catch(Exception e ) {
					return false;
				} 
			}case ']' : {
				try {
					if(stack.peek().equals('[')) {
						stack.pop();
						break;
					}else {
						return false;
					}
				}catch (Exception e) {
					return false;
				} 
			}case ')' : {
				try {
					if(stack.peek().equals('(')) {
						stack.pop();
						break;
					}else {
						return false;
					}
				}catch(Exception e) {
					return false;
				}
			}
			default:
				stack.add(s.charAt(i));
			}
    	}
    	
    	return stack.size() == 0 ? true : false;
    }
    
}
