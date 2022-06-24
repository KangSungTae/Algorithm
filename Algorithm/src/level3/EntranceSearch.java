package level3;


/* ���α׷��ӽ� ���� 3 �Ա��ɻ�� �ּ� �ð��� ���϶�
 * �̺а˻� �˰��� 
 * �Ա��ɻ�� �� �ҿ�ð��� ���� �迭 times�� �־����� 
 * �Ա��� ����ϴ� �ο� �� N�� �־����ٸ� ��� �Ա� �ɻ縦 ���� �� �ִ� 
 * �ּ��� �ð� T�� ���϶�.
 * 
 * */
public class EntranceSearch {

	public static void main(String[] args) {

		long[] input = {7,10};

		System.out.println("" + solution(6, input));
	}

	/* �ð��� �ּҰ��̴� */
	public static long solution(long people, long[] times) {
 
		long min = 0;
		long max = times[times.length-1]*people;
		
		while(min <= max) {
			long avgTime = (min + max) / 2;
			long cnt = 0;
			
			for(long time : times) {
				cnt += avgTime / time;
			}
			
			if(cnt < people) {
				min = avgTime + 1;
			}else {
				max = avgTime - 1;
			}
		}
		return min;
	}
}
