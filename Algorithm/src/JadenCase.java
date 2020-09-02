import java.util.Arrays;

public class JadenCase {
	public String solution(String s) {
        String answer = "";
        String[] list = s.split(" ");
        for(int i = 0 ; i < list.length ; i ++) {
        	System.out.println(list[i]);
        	if(list[i].equals(" ")) {
        		answer += " ";
        		continue;
        	}
        	if(list[i].charAt(0)>= 97 && list[i].charAt(0) <= 122) {
        		list[i] = String.valueOf(list[i].charAt(0)).toUpperCase()+list[i].substring(1).toLowerCase();
        	}
        	if(i == list.length-1) {
        		answer += list[i];
        	} else {
        		answer += list[i] + " ";
        	}
        }
        System.out.println(answer);
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JadenCase jc = new JadenCase();
		jc.solution("\"Hello My      Friend\"");
	}

}
