import java.util.*;
public class Mr_Kim {
	public String solution(String[] seoul) {
        String answer = "�輭���� ";
        for(int i = 0 ; i < seoul.length ; i ++) {
        	if(seoul[i].equals("Kim")) {answer += i+"�� �ִ�";}
        }      
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
