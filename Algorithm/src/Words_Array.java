import java.util.*;

import oracle.net.aso.s;

public class Words_Array {
	public String[] solution(String[] strings, int n) {
		String[] answer = strings.clone();
		for (int i = 0; i < strings.length; i++) {
			answer[i] = answer[i].substring(n, n+1)+ strings[i];
		}
		Arrays.sort(answer);
		for(int i = 0 ; i < strings.length ; i ++) {
			answer[i] = answer[i].substring(1);
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
