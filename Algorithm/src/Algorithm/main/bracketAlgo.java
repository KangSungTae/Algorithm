package Algorithm.main;
import java.util.Stack;

public class bracketAlgo {

	public static void main(String[] args) {
		
		/* input �� a �� �������� length ��ŭ �̵��Ҷ� �Ϻ��� ���ڿ��� �Ǵ� ������ ���϶�.*/
		/* java.util �� stack �� push , pop(�� ȣ�� �� ����) , peek(�� Ȯ��) 3������ �������� ����. */
		 
		String b = "{{{{{{{";
//		checkCorrect(b);
//		solution(a);
		System.out.println(""+solution(b));
	}
	
	/* �������� iĭ�� �̵��ϸ� �Ϻ��� ���ڿ��� ã�� �Լ��� ȣ�� */
    public static int solution(String s) {
        int answer = 0;
        
        for(int i = 0 ; i < s.length() ; i ++) {
        	/* �������� iĭ�� */
        	String k = s.substring(i, s.length()) + s.substring(0,i);
            if(checkCorrect(k)) {
            	answer += 1;
            }
        }

        return answer;
    }
    
    /* �Ϻ��� ���ڿ� check �Լ�. */
    public static boolean checkCorrect(String s) {
		/* stack �� Ȱ���Ͽ� ������ ���� */
    	
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
