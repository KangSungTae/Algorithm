import java.util.Arrays;

public class FatigueSearch {

	public static void main(String[] args) {

//		int[][] dungeons = { { 80, 40 }, { 40, 20 }, { 40, 20 } };
//		int[][] dungeons2 = {{ 90 ,20 } ,{ 80 ,60 } ,{ 70, 50 },{30,20},{10,10}};
//		int[][] dungeons3 = {{ 100 ,10 } ,{ 100 ,10 } ,{ 90, 10 },{80,10},{70,10}
//		,{60,10},{50,10},{40,20}};
//		int[][] dungeons4 = {{200,50} , {150,40} , {70,30} , {80,20} , {80,20}};
		
		int[] temp = { 0, 1, 2, 3, 4, 5, 6, 7 };

		permutation(temp, 0, 8, 8);

	}

	/* 완전탐색 알고리즘? */
	public static int solution(int k, int[][] dungeons) {
		int answer = 0;
			
		
			
		return answer;
	}

	/*
	 * dungeons 의 length 만큼 순열을 구하는 함수 1개 필요 -> array로 리턴 후 array를 순차적으로 탐색하면서
	 * answer를 구한다.
	 */
	static void permutation(int[] arr, int depth, int n, int r) {

		if (depth == r) {
			System.out.println("" + Arrays.toString(arr));
		}
		for (int i = depth; i < n; i++) {
			swap(arr, depth, i);
			permutation(arr, depth + 1, n, r);
			swap(arr, depth, i);
		}

	}

	static void swap(int[] arr, int depth, int i) {
		int temp = arr[depth];
		arr[depth] = arr[i];
		arr[i] = temp;
	}
}
