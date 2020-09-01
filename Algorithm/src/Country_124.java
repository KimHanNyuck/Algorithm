
public class Country_124 {
	public String solution(int n) {
        String answer = "";
        StringBuffer sb = new StringBuffer();
        while(n > 0) {
        	sb.insert(0, n%3);
        	n /= 3;
        }
        answer = sb.toString();
        System.out.println(sb);
        answer.replaceAll("0", "1").replaceAll("2", "4");
        System.out.println(answer);
        
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country_124 c1 = new Country_124();
		c1.solution(8);
	}

}
