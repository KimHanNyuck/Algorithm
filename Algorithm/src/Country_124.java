
public class Country_124 {
	public String solution(int n) {
        String answer = "";
        String[] num = {"4","1","2"};
        while(n>0) {
            answer = num[n%3]+answer;
            n = (n-1)/3;
        }
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country_124 c1 = new Country_124();
		c1.solution(1);
	}

}
