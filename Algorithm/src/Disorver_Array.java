import java.util.*;

public class Disorver_Array {
	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		int number = list.size();
		if(number ==0) {
			return new int[] {-1};
		}
		answer = new int[number];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
			System.out.println(answer[i]);
		}
		Arrays.sort(answer);
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Disorver_Array da = new Disorver_Array();
		da.solution(new int[] { 3, 2, 6 }, 10);
	}

}
