import java.util.HashMap;
import java.util.Map;

public class Arrays_zip {
	public int solution(String s) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap();
        for(int i = 1 ; i <= s.length()/2; i ++) {
        	if(s.length()%i==0) {
        		map.put(i, 0);
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
