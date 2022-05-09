import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 프로그래머스 레벨2 스코빌 지수를 구하라. */
/* 시간복잡도를 고려하지 않고 배열로 구현 -> 효율성 fail */

public class scovileAlg {

	public static void main(String[] args) {

		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		int K = 104;
 		
		System.out.println(""+ getMesCnt(scoville, K));
	}

	public static int getMesCnt(int[] scoivlile , int k) {
			
		int cnt = 0; 

		while(checkArray(scoivlile,k)){
			
			for(int i = 0 ; i < scoivlile.length; i ++) {
				if(k > scoivlile[i] && i+1 < scoivlile.length){
					scoivlile[i] = scoivlile[i] + (scoivlile[i+1] * 2);
					scoivlile = pop(scoivlile , i+1);
					Arrays.parallelSort(scoivlile);
					cnt++;
					break;
				}
			}
			if(scoivlile.length == 1 && scoivlile[0] < k) {
				cnt = -1;
				break;
			}
		}
		return cnt;
	}
	
		public static int[] pop(int[] array , int index) {
			
			int[] newArray = new int[array.length-1];
			
			for(int i = 0 ; i < array.length ; i ++) {
				if(i < index) {
					newArray[i] = array[i];
				} else if(i > index) {
					newArray[i-1] = array[i];
				}
			}
			return newArray;
		}
	
	public static boolean checkArray(int[] array , int K) {
		
		boolean result = false; 
		
		for(int i = 0 ; i < array.length; i ++) {
			 if(array[i] < K) {
				result = true;
				break;
			}
		}
		return result;
	}
}
