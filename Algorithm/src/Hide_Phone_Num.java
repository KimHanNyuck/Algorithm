import java.util.Arrays;

public class Hide_Phone_Num {
	public String solution(String phone_number) {
		char[] c = phone_number.toCharArray();
		String[] s = new String[phone_number.length()];
		for (int i = 0; i < phone_number.length() - 4; i++) {
			if(i < phone_number.length() -4) {
				c[i] = '*';
			}
			s[i] = String.valueOf(c[i]);
		}
		return Arrays.stream(s).reduce((a,b) -> a+b).orElse("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
