
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

		/* ±ÕÇüÀâÈù °ýÈ£ ¹®ÀÚ¿­ÀÌ¶õ */
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
