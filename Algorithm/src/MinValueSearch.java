import java.util.ArrayList;
import java.util.List;

public class MinValueSearch {

	public static void main(String[] args) {
		int a = 5;
		int b = 31168;
		
		System.out.println("solution:"+solution(a , b));
		
	}
	
	public static int solution(int n , int number) {
		
		List<Integer> valueList = new ArrayList<Integer>();
		List<Integer> resList = new ArrayList<Integer>();
		
		/* 계산을 편하게 하기 위한 임의의 값 valueList 생성 (값 크기만큼 내림차순정렬) */
		if(n != 1) {
			for(int i = Integer.toString(number).length() ; i > 0 ; i-- ) {
				/* 더해질 값 하단 */
				valueList.add(Integer.parseInt(Integer.toString(n).repeat(i)));
				valueList.add(Integer.parseInt("1".repeat(i)));
			}
		}
		/* 1 일경우에만 별도로 선언한다. */
		else { 
			for(int i = Integer.toString(number).length() ; i > 0 ; i-- ) {
				/* 더해질 값 하단 */
				valueList.add(Integer.parseInt("1".repeat(i)));
			}
		}
		
		/* 뺴는 로직 */ 
		/* 구해야 하는 것은 answer 이므로 */
		while(number > 0) {
			for(int i = 0 ; i < valueList.size(); i++) {
				if(number - valueList.get(i) >= 0) {
					resList.add(valueList.get(i));
					number = number - valueList.get(i);
					break;
				}
			}
		}
		
		int tempAnswer = 0;
		/* resList에 들어가 있는 n의 개수를 구하면 된다.*/ 
		for(int i = 0 ; i < resList.size() ; i ++) {
			/* 나의 수 */
			if(resList.get(i)%n == 0) {
				tempAnswer += resList.get(i).toString().length();
			}else {
			/* 연달아 1로 걸리는 경우에 괄호로 처리가 가능하다. */
				tempAnswer += resList.get(i).toString().length() + 1;
				if(i >= 1 && resList.get(i-1)%n != 0) {
					tempAnswer = tempAnswer - 1; 
				}
			}
		}
		
		if(tempAnswer > 8) {
			tempAnswer = -1;
		}
		return tempAnswer;
	}
}
