package level2;
import java.util.Stack;

public class Programmars_lv2_Printer {

	/* 프로그래머스 - 스택 - 프린터 */
	// 현재 대기목록에 있는 문서의 중요도가 순서대로 담긴 배열 priorities와 
	// 내가 인쇄를 요청한 문서가 현재 대기목록의 어떤 위치에
	// 있는지를 알려주는 location이 매개변수로 주어질 때, 내가 인쇄를 
	// 요청한 문서가 몇 번째로 인쇄되는지 return 하도록 solution 함수를 작성해주세요.
	
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
		
		/* location 은 index 0부터 시작. */
		 
		int temp = 0;
		
		/* 순수 algo 로 가면 계속 도는거지 c-d-a-b 순이다. 뒤에 나보다 큰게 없으면 들어가는거지. */
		/* index는 한번씩 증가하고 */
		/* 최종까지 돌면 다시 처음부터 시작해야되고 */
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
