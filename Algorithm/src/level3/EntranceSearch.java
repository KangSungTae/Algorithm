package level3;


/* 프로그래머스 레벨 3 입국심사대 최소 시간을 구하라
 * 이분검색 알고리즘 
 * 입국심사대 별 소요시간을 가진 배열 times가 주어질때 
 * 입국을 대기하는 인원 수 N이 주어진다면 모두 입국 심사를 끝낼 수 있는 
 * 최소의 시간 T를 구하라.
 * 
 * */
public class EntranceSearch {

	public static void main(String[] args) {

		long[] input = {7,10};

		System.out.println("" + solution(6, input));
	}

	/* 시간의 최소값이다 */
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
