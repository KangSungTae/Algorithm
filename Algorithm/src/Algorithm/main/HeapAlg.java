package Algorithm.main;
import java.util.PriorityQueue;

/* 프로그래머스 레벨2 스코빌 지수를 구하라. */
/* 시간복잡도 감소를 위하여 Heap 을 사용하여 구현 */

public class HeapAlg {

	public static void main(String[] args) {

		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		
		System.out.println(solution(scoville , 1));

	}

	public static int solution(int[] scoville, int K) {

		int answer = 0;
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

		for (int i = 0; i < scoville.length; i++) {
			minHeap.add(scoville[i]);
		}
		 
		while(minHeap.peek() < K && minHeap.size() != 1) {	
			int nextVal = minHeap.poll() + (minHeap.poll()*2);
			minHeap.add(nextVal);
			answer++;
		}
		
		if(minHeap.size()==1 && minHeap.peek() < K) {
			answer = -1;
		}
		
		return answer;
	}

}
