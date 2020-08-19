import java.util.Arrays;

public class Chars_Desc {
	public String solution(String s) {
		String answer = "";
		int[] c = s.chars().toArray();	
		Arrays.sort(c);
        for(int i = c.length-1 ; i >= 0 ; i --) {
        	answer += String.valueOf((char)c[i]);
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
