import java.util.*;

public class Prime_Number {
	public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        boolean[] bl = new boolean[n+1];
        bl[0] = bl[1] = true;
        for (int i = 2; i*i <= n; i++) { 
        	if(!bl[i]) {
        		for(int j = i*i ; j<= n; j+=i) bl[j]=true;
        	}
        }
        for(int i = 1 ; i <= n ; i++) {
        	if(!bl[i]) list.add(i);
        }
        answer = list.size();
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
