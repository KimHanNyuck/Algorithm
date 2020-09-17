import java.util.Arrays;

public class JadenCase {
	public String solution(String s) {
        String answer = "";
        String[] list = s.toLowerCase().split(" ");
        for(int i = 0 ; i < list.length ; i ++) {
        	if(list[i].equals(" ")) {
        		answer += " ";
        		continue;
        	}
        	try {
        	if(list[i].charAt(0)>= 97 && list[i].charAt(0) <= 122) {
        		if(list[i].length()==1) {
        			list[i] = String.valueOf(list[i].charAt(0)).toUpperCase();
        		} else {
        			list[i] = String.valueOf(list[i].charAt(0)).toUpperCase()+list[i].substring(1).toLowerCase();
        		}
        	} else {
        		list[i] = list[i];
        	}
        	} catch(Exception e) {
        		list[i] = "";
        	}
        	if(i == list.length-1) {
        		answer += list[i];
        	} else {
        		answer += list[i] + " ";
        	}
        }
        if (answer.length() != s.length()) { 
			int length = s.length() - answer.length();
			for (int i = 0; i < length; i++) {
				answer += " ";
			}
		}
        System.out.println(answer);
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JadenCase jc = new JadenCase();
		jc.solution("  for the last week  ");
		jc.solution("  For The Last W eek");
		System.out.println("s                 ");
		
	}

}
