import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Tuple {

	public static void main(String[] args) {

		String temp = "{{20,111},{111}}";
		String[] arr = temp.replaceAll("[{}]", " ").trim().split(" , ");

		solution(temp);
	}
	
	public static int[] solution(String s) {

		HashMap<String, Integer> result = new HashMap<String, Integer>();

		/* 문자열을 쪼갤필요가있나..그냥 넣으면 되는거지.. */
		String chgS = s.replaceAll("[{}]", "");

		/* 순서가 중요하다. */

		int stx = 0;
		for (int i = 0; i < chgS.length(); i++) {

			if (chgS.charAt(i) == ',') {
				String temp = chgS.substring(stx, i);
				if (result.get(temp) != null) {
					int param = result.get(temp);
					result.put(temp, param + 1);
				} else {
					result.put(temp, 1);
				}
				stx = i + 1;
			} else if (i == chgS.length() - 1) {
				String temp = chgS.substring(stx, chgS.length());
				if (result.get(temp) != null) {
					int param = result.get(temp);
					result.put(temp, param + 1);
				} else {
					result.put(temp, 1);
				}
			}
		} 
		List<Map.Entry<String, Integer>> entryListSet = new ArrayList<Map.Entry<String, Integer>>(result.entrySet());
		entryListSet.sort(new Comparator<Map.Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				 
				return o2.getValue() - o1.getValue();
			}
		});
		
		int[] answer = new int[entryListSet.size()];
		int i = 0;
		for(Map.Entry<String, Integer> data : entryListSet) {
			answer[i] = Integer.parseInt(data.getKey());
			i++;
		}
		
		
		return answer;
	}
}
