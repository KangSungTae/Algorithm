package Algorithm.main;
/* ���� Ǫ���� ���α׷��ӽ� ���� 2 - ��Ʈ���� ȸ�� (����׵θ�)*/

public class MatrixRotationAlgorithm {

	public static int[][] matrix;

	public static void main(String[] args) {

		int[][] test = { { 2, 2, 5, 4 }, { 3, 3, 6, 6 }, { 5, 1, 6, 3 } };

		solution(6, 6, test);
	}

	public static int[] solution(int rows, int columns, int[][] queries) {

		/* queries �ϳ����� 1���� answer �� �����Ѵ�. */
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

	/* ���������� ó���Ѵ�. */
	public static int getMin(int[] query) {
		/* {2,2,5,4} */
		// ��. 
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
