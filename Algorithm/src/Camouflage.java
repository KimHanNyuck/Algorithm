import java.util.HashMap;
import java.util.Map;


public class Camouflage {
	public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < clothes.length ; i ++) {
        	if(map.get(clothes[i][1])==null) {
        		map.put(clothes[i][1], 1);
        	} else {
        		map.replace(clothes[i][1], map.get(clothes[i][1])+1);
        	}
        }
        for(Map.Entry<String, Integer> elem : map.entrySet()) {
        	if(map.size() == 1) {
        		return elem.getValue();
        	} else {
        		answer *= elem.getValue();
        	}
        }
        answer += clothes.length;
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
