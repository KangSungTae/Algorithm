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

        /* �����ϴ� �ڸ��� n�� �ʿ� */
        int n = 1;
        /* ����� �ű� ���ڿ� */
        String chgResult = "";
        
        while(n == s.length()) {
        	
        	for(int i = 0 ; i < s.length() ; i ++) {
        		
        	}
        	n++ ;
        }
        
        return answer;
    }
    
    /* �������ڿ� + ���̸� �Է¹޾��� ��� ����� ���ڿ��� ��ȯ�ϴ� �Լ� ����. */
    public static String chgString(String s , int length) {
    	String result = "";

    	for(int i = 0 ; i < s.length() ; i = i + length) {
    		/* overflow ���� */
    		if(s.length() - length > i ) {
    		}
    	}
    	
    	return result;
    }
    
}
