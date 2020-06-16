import java.util.ArrayList;

public class Steal_weapon {
	public int solution(String arrangement) {
        int answer = 0;
        ArrayList list = new ArrayList();
        int stick = 0 ;
        for(int i = 0 ; i < arrangement.length(); i ++) {
        	if(arrangement.charAt(i)=='(' && arrangement.charAt(i+1)==')') {
        		list.add('+');
        		i++;
        	} else {
        		list.add(arrangement.charAt(i));
        	}
        	
        }
        for(int i = 0 ; i < list.size(); i ++) {
        	if(list.get(i).equals('(')) {
        		stick++;
        		answer ++;
        	} else if(list.get(i).equals(')')) {
        		answer++;
        		stick--;
        	} else if(list.get(i).equals('+')) {
        		answer += stick;
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Steal_weapon sw = new Steal_weapon();
		sw.solution("()(((()())(())()))(())");
	}

}
