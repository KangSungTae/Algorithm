package level3;

/* 프로그래머스 레벨 3 정수 삼각형
 * 동적계획법
 * 삼각형의 꼭대기에서 바닥까지 이어지는 경로 중
 * 거쳐간 숫자의 합이 가장 큰 경우를 찾아라.
 * 단, 아래칸으로 이동 시 왼쪽과 오른쪽으로만 이동이 가능하다.
 * 
 * 
 * 풀이 : 
 * */
public class equalTriangle {
 
	public static void main(String[] args) {
		int[][] triangle = { { 7 }, { 3, 8 }, { 8, 1, 0 }, { 2, 7, 4, 4 }, { 4, 5, 2, 6, 5 } };
 
		solution(triangle); 
	}

	public static int solution(int[][] triangle) {
		int answer = 0;

		//0일 경우에 0의 값을 가지고 올 수 있다.
		//length - 1에 도달하면 항상 이전 length -1의 값을 가지고올수 있고
		//중간은 1일 경우 -> [i-1] 0과 1 중 큰 값 
		//중간이 2일 경우 -> [i-1] 1과 2중 큰 값 
		//중간이 3일 경우 -> [i-1] 2와 3중 큰 값 
		//
		//인 2차원 배열을 새로 만들수가 있으므로..
		//
		//이것을 식으로 구현하면 ..
		
		/* 2차원 배열 sum 초기화 */
		int sum[][] = null;
		for(int i = 0 ; i <= triangle.length ; i ++) {
			sum = new int[i][];
		}
		
		for(int i = 0 ; i < triangle.length ; i ++) {
			sum[i] = new int[triangle[i].length ];
		}
		sum[0][0] = triangle[0][0];
		/* 2차원 배열 내 최대값 저장 */
		for (int i = 1; i < triangle.length ; i++) {
			for (int j = 0; j < triangle[i].length ; j++) {
				if (j == 0) {
					sum[i][j] = triangle[i][j] + sum[i - 1][0];
				} else if (j == triangle[i].length - 1) {
					sum[i][j] = triangle[i][j] + sum[i - 1][j - 1];
				}else {
					sum[i][j] = triangle[i][j] + Math.max(sum[i - 1][j-1],sum[i - 1][j]);
				}
			}

		}
		int index = sum.length - 1;
		/* 구해진 sum 배열 내 마지막 인덱스를 순회하며 최대값을 구하여 리턴한다.*/
		for(int i = 0 ; i <= sum[index].length - 1; i++) {
			if(answer < sum[index][i]) {
				answer = sum[index][i];
			}
		}
		
		return answer;
	}

}
