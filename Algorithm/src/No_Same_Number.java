import java.util.*;
public class No_Same_Number {
	public int[] solution(int []arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList<Integer>();
        int number = 0;
        for(int i = 0 ; i < arr.length ; i ++) {
        	if(i == 0 ) {
        		number = arr[0];
        		list.add(arr[0]);
        	} else {
        		if(arr[i]==number) {
        			continue;
        		} else {
        			number = arr[i];
        			list.add(arr[i]);
        		}
        	}
        }
        answer = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i ++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
