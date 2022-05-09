import java.util.ArrayList;

public class EncStringAl {

	public static void main(String[] args) {
		
		String case1 = "aabbaccc";
		String case2 = "ababcdcdababcdcd";
		String case3 = "abcabcdede";
		String case4 = "abcabcabcabcdededededede";
		String case5 = "xababcdcdababcdcd";
		
		ArrayList<String> test = new ArrayList<String>();
		test.add(case1);
		test.add(case2);
		test.add(case3);
		test.add(case4);
		test.add(case5);
		
		for(int i = 0 ; i < test.size() ; i ++) {
			System.out.println("case"+ i + " || result : " + solution(test.get(i)));
		}
	}
	
	
    public static int solution(String s) {
        int answer = 0;

        /* 순증하는 자리수 n이 필요 */
        int n = 1;
        /* 변경된 신규 문자열 */
        String chgResult = "";
        
        while(n == s.length()) {
        	
        	for(int i = 0 ; i < s.length() ; i ++) {
        		
        	}
        	n++ ;
        }
        
        return answer;
    }
    
    /* 기존문자열 + 길이를 입력받았을 경우 변경된 문자열을 반환하는 함수 선언. */
    public static String chgString(String s , int length) {
    	String result = "";

    	for(int i = 0 ; i < s.length() ; i = i + length) {
    		/* overflow 방지 */
    		if(s.length() - length > i ) {
    		}
    	}
    	
    	return result;
    }
    
}
