package level3;

/* ���α׷��ӽ� ���� 3 ���� �ﰢ��
 * ������ȹ��
 * �ﰢ���� ����⿡�� �ٴڱ��� �̾����� ��� ��
 * ���İ� ������ ���� ���� ū ��츦 ã�ƶ�.
 * ��, �Ʒ�ĭ���� �̵� �� ���ʰ� ���������θ� �̵��� �����ϴ�.
 * 
 * 
 * Ǯ�� : 
 * */
public class equalTriangle {
 
	public static void main(String[] args) {
		int[][] triangle = { { 7 }, { 3, 8 }, { 8, 1, 0 }, { 2, 7, 4, 4 }, { 4, 5, 2, 6, 5 } };
 
		solution(triangle); 
	}

	public static int solution(int[][] triangle) {
		int answer = 0;

		//0�� ��쿡 0�� ���� ������ �� �� �ִ�.
		//length - 1�� �����ϸ� �׻� ���� length -1�� ���� ������ü� �ְ�
		//�߰��� 1�� ��� -> [i-1] 0�� 1 �� ū �� 
		//�߰��� 2�� ��� -> [i-1] 1�� 2�� ū �� 
		//�߰��� 3�� ��� -> [i-1] 2�� 3�� ū �� 
		//
		//�� 2���� �迭�� ���� ������� �����Ƿ�..
		//
		//�̰��� ������ �����ϸ� ..
		
		/* 2���� �迭 sum �ʱ�ȭ */
		int sum[][] = null;
		for(int i = 0 ; i <= triangle.length ; i ++) {
			sum = new int[i][];
		}
		
		for(int i = 0 ; i < triangle.length ; i ++) {
			sum[i] = new int[triangle[i].length ];
		}
		sum[0][0] = triangle[0][0];
		/* 2���� �迭 �� �ִ밪 ���� */
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
		/* ������ sum �迭 �� ������ �ε����� ��ȸ�ϸ� �ִ밪�� ���Ͽ� �����Ѵ�.*/
		for(int i = 0 ; i <= sum[index].length - 1; i++) {
			if(answer < sum[index][i]) {
				answer = sum[index][i];
			}
		}
		
		return answer;
	}

}
