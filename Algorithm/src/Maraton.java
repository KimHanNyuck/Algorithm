
import java.util.Arrays;


public class Maraton {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i = 0;
        for(; i < participant.length ; i ++) {
        	try {
        	if(!participant[i].equals(completion[i])) {
        		return participant[i];
        	}
        	} catch(Exception e) {
        		return participant[i];
        	}
        }
        return participant[i];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
