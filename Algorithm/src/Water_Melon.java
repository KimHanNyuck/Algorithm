
public class Water_Melon {
	public String solution(int n) {
		String answer = "";
		for (int i = 0; i < n; i += 2) {
			if (n % 2 == 0) {
				answer += "수박";
			} else {
				if (i == n - 1) {
					answer += "수";
				} else {
					answer += "수박";
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
