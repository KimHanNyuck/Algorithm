import java.util.*;
public class Mr_Kim {
	public String solution(String[] seoul) {
        String answer = "김서방은 ";
        for(int i = 0 ; i < seoul.length ; i ++) {
        	if(seoul[i].equals("Kim")) {answer += i+"에 있다";}
        }      
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
