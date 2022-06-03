import java.util.Arrays;

public class permutation {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };

//		System.out.println(""+Arrays.asList(a));
		permutation(a, 0, 4, 4);
	}

	static void permutation(int[] arr, int depth, int n, int r) {

		if (depth == r) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		/* 4번 호출 -> 3번호출 -> 2번 호출이므로 24번의 결과가 나오는것은 당연한데. */
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
