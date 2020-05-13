import java.util.ArrayList;
import java.util.Collections;

public class Make_Biggest_Number {
	
	public String solution(String number, int k) {
        String answer = "";
        ArrayList list = new ArrayList<>();
        ArrayList removelist = new ArrayList<>();
        ArrayList answerlist = new ArrayList<>();
        for(int i = 0 ; i < number.length() ; i ++) {
        	list.add(number.charAt(i));
        	answerlist.add(number.charAt(i));
        }
        Collections.sort(list);
        for(int i = 1 ; i <= k ; i ++) {
            removelist.add(list.get(0));
        	list.remove(0);
        }
        for(int i = 0 ; i < answerlist.size() -1 ; i ++) {
        	System.out.println(answerlist.get(i));
        }
        for(int i = 0 ; i < answerlist.size() -1 ; i ++) {
        	if(answerlist.get(i).equals((removelist.get(0)))) {
        		answerlist.remove(removelist.get(0));
        		removelist.remove(0);
        	} else {
        		continue;
        	}
        }
        for(int i = list.size()-1 ; i >= 0 ; i --) {
        	answer += list.get(i);
        }
        
        System.out.println("..........................");
        for(int i = 0 ; i < removelist.size() -1 ; i ++){
        	System.out.println(removelist.get(i));
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Make_Biggest_Number mbn = new Make_Biggest_Number();
		System.out.println(mbn.solution("4177252841", 4));
	}

}
