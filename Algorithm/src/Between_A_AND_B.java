
public class Between_A_AND_B {
	public long solution(int a, int b) {
        long answer = 0;
        if(a == b) return a;
        for(int i = Math.min(a, b); i <= Math.max(a,b); i++) {
        	answer += i;
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
