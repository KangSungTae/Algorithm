package Algorithm.main;
/* 문제 푸는중 프로그래머스 레벨 2 - 매트릭스 회전 (행렬테두리)*/

public class MatrixRotationAlgorithm {

	public static int[][] matrix;

	public static void main(String[] args) {

		int[][] test = { { 2, 2, 5, 4 }, { 3, 3, 6, 6 }, { 5, 1, 6, 3 } };

		solution(6, 6, test);
	}

	public static int[] solution(int rows, int columns, int[][] queries) {

		/* queries 하나마다 1개의 answer 가 존재한다. */
		int[] answer = new int[queries.length];

		matrix = new int[rows][columns];

		int start = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = start++;
			}
		}

		for (int i = 0; i < queries.length; i++) {
			answer[i] = getMin(queries[i]);
		}

		return answer;
	}

	/* 전역변수로 처리한다. */
	public static int getMin(int[] query) {
		/* {2,2,5,4} */
		// 흠. 
		int next1 = 0;
		
		
		int a = query[0] - 1;
		int b = query[1] - 1;
		int c = query[2] - 1;
		int d = query[3] - 1;
		
		for(int i = 0 ; i < a*b*c*d ; i ++) {
			
		}
		
		matrix.toString();
		return 0;
	}

}
