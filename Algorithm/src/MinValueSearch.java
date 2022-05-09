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
		
		/* ����� ���ϰ� �ϱ� ���� ������ �� valueList ���� (�� ũ�⸸ŭ ������������) */
		if(n != 1) {
			for(int i = Integer.toString(number).length() ; i > 0 ; i-- ) {
				/* ������ �� �ϴ� */
				valueList.add(Integer.parseInt(Integer.toString(n).repeat(i)));
				valueList.add(Integer.parseInt("1".repeat(i)));
			}
		}
		/* 1 �ϰ�쿡�� ������ �����Ѵ�. */
		else { 
			for(int i = Integer.toString(number).length() ; i > 0 ; i-- ) {
				/* ������ �� �ϴ� */
				valueList.add(Integer.parseInt("1".repeat(i)));
			}
		}
		
		/* ���� ���� */ 
		/* ���ؾ� �ϴ� ���� answer �̹Ƿ� */
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
		/* resList�� �� �ִ� n�� ������ ���ϸ� �ȴ�.*/ 
		for(int i = 0 ; i < resList.size() ; i ++) {
			/* ���� �� */
			if(resList.get(i)%n == 0) {
				tempAnswer += resList.get(i).toString().length();
			}else {
			/* ���޾� 1�� �ɸ��� ��쿡 ��ȣ�� ó���� �����ϴ�. */
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
