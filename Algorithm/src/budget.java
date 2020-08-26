import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class budget {
	public int solution(int[] d, int budget) {
        int answer = 0;
        int number = 0;
        Arrays.sort(d);
        for(int i = 0 ; i < d.length ; i++) {
        	number += d[i];
        	if(number > budget) {
        		break;
        	}
        	answer++;
        	
        }
        return answer;
    }	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
