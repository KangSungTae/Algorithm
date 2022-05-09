
/* 프로그래머스 레벨2 카카오블라인드 테스트 알고리즘 - 
 * () 의 짝을 맞춰 재구성 하라. */

public class KaKaoBlind {

	public static void main(String[] args) {

		String test = ")(";

		System.out.println("" + Solution(test));
	}

	public static String Solution(String p) {

		String answer = "";
		String w = "";
		String u = "";
		String v = "";

		if (p.equals("")) {
			return answer;
		} else {

			w = p;
			int temp = 0;

			for (int i = 0; i < w.length(); i++) {

				if (w.charAt(i) == '(') {
					temp = temp + 1;
					u += '(';
				} else if (w.charAt(i) == ')') {
					temp = temp - 1;
					u += ')';
				}

				if (temp == 0 && i != 0) {
					v = w.substring(i + 1);
					break;
				}
			}
		}

		/* 균형잡힌 괄호 문자열이란 */
		if (u.charAt(0) == '(') {
			u += Solution(v);
			answer = u;
		} else {
			String temp = "(";
			temp += Solution(v) + ")";
			u = u.substring(0 + 1 , u.length() -1 );
			
			String revert = "";
			for(int i = 0 ; i < u.length() ; i++) {
				if(u.charAt(i) == '(') {
					revert += ')';
				}else {
					revert += '(';
				}
			}
			
			temp += revert;
			answer = temp;
		}

		return answer;
	}

}
