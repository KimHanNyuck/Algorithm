
public class Central_Note {
	public String solution(String s) {
        String answer = "";
        int length = s.length()/2;
        if(s.length() %2 ==0) {
        	answer = String.valueOf(s.charAt(length-1))+String.valueOf(s.charAt(length)); 
        } else {
        	answer = String.valueOf(s.charAt(length));
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
