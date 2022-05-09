import java.util.Arrays;

public class Solution {
	
	
	public int getMesCnt(int[] scoivlile, int k) {

		int answer = 0;
		Arrays.parallelSort(scoivlile);

		while (checkArray(scoivlile, k)) {

			for (int i = 0; i < scoivlile.length; i++) {
				if (k > scoivlile[i] && i + 1 < scoivlile.length) {
					scoivlile[i] = scoivlile[i] + (scoivlile[i + 1] * 2);
					scoivlile = pop(scoivlile, i + 1);
					Arrays.parallelSort(scoivlile);
					answer++;
					break;
				}
			}
		}
		return answer;
	}

	public int[] pop(int[] array, int index) {

		int[] newArray = new int[array.length - 1];

		for (int i = 0; i < array.length; i++) {
			if (i < index) {
				newArray[i] = array[i];
			} else if (i > index) {
				newArray[i - 1] = array[i];
			}
		}
		return newArray;
	}

	public boolean checkArray(int[] array, int K) {

		boolean result = false;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < K) {
				result = true;
				break;
			}
		}
		return result;
	}
}
