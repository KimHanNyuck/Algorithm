import java.util.*;

import com.sun.tools.javac.util.ArrayUtils;

public class Examination {
	public int[] solution(int[] answers) {
        int[] answer = {};
        int[] first= new int[] {1,2,3,4,5};
        int[] second = new int[] {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int num1 = 0, num2 = 0 , num3 = 0;
        for(int i =0; i<answers.length; i++){
            if(first[i%first.length] == answers[i]) num1++;
            if(second[i%second.length] == answers[i]) num2++;
            if(third[i%third.length] == answers[i]) num3++;
        }
        int highest = Math.max(num1, Math.max(num2, num3));
        List<Integer> list = new ArrayList();
        if(highest == num1) {
        	list.add(1);
        }
        if( highest == num2) {
        	list.add(2);
        }
        if (highest == num3) {
        	list.add(3);
        }
        answer = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++) {
        	answer[i]= list.get(i);
        }
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
