
/* ���α׷��ӽ� ���� 2 2017 �����ٿ� - �������ǥ */

public class TipStart {

	public static void main(String[] args) {
		System.out.println("" + solution(8, 4, 5));
	}

	public static int solution(int n, int a, int b) {
		int answer = 0;

		while (true) {
			if (a > b) {
				if (a == b + 1 && b%2 ==1) {
					answer ++;
					return answer;
				} else {
					a = a / 2 + a % 2;
					b = b / 2 + b % 2;
				} 
			} else if (a < b) {
				if (a == b - 1 && a%2 == 1) {
					answer ++;
					return answer;
				} else {
					a = a / 2 + a % 2;
					b = b / 2 + b % 2;
				}
			}
			answer++;
		}
	}
}
