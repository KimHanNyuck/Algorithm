
public class Make_Biggest_Number {

	public String solution(String number, int k) {
		int idx = 0;
		StringBuilder answer = new StringBuilder();

		if (number.charAt(0) == '0') {
			return "0";
		}
		for (int i = 0; i < number.length() - k; i++) {
			char c = '0';
			for (int j = idx; j <= k + i; j++) {
				if (c < number.charAt(j)) {
					c = number.charAt(j);
					idx = j + 1;
				}
			}
			answer.append(c);
		}
		return answer.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Make_Biggest_Number mbn = new Make_Biggest_Number();
		System.out.println(mbn.solution("4177252841", 4));
	}

}
