package level2;
import java.util.Stack;

public class Programmars_lv2_Printer {

	/* ���α׷��ӽ� - ���� - ������ */
	// ���� ����Ͽ� �ִ� ������ �߿䵵�� ������� ��� �迭 priorities�� 
	// ���� �μ⸦ ��û�� ������ ���� ������� � ��ġ��
	// �ִ����� �˷��ִ� location�� �Ű������� �־��� ��, ���� �μ⸦ 
	// ��û�� ������ �� ��°�� �μ�Ǵ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.
	
	public static void main(String[] args) {
		int[] input = {2,1,3,2};
		int loc = 2;
		
		double a = 999999999.1111111111111;
		
		System.out.println(a);
		
//		solution(input,loc);
	}

	public static int solution(int[] priorities, int location) {
		int answer = 0;
		
		Stack<Integer> stack = new Stack<Integer>();
		
		/* location �� index 0���� ����. */
		 
		int temp = 0;
		
		/* ���� algo �� ���� ��� ���°��� c-d-a-b ���̴�. �ڿ� ������ ū�� ������ ���°���. */
		/* index�� �ѹ��� �����ϰ� */
		/* �������� ���� �ٽ� ó������ �����ؾߵǰ� */
		int index = 0;
		
		while(true) {
			int max = 0;
			
			for(int i = index ; i < priorities.length; i++) {
				if(max > priorities[i]) {
					max = priorities[i];
				}
			}
			index++;
		}
		
//		return answer;
	}

}
