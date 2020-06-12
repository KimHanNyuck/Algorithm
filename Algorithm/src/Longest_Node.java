import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Longest_Node {
	public int solution(int n, int[][] edge) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Map<Integer, Integer> level = new HashMap<Integer, Integer>();
        for(int i = 0 ; i < edge.length; i++) {
        	if(edge[i][0] > edge[i][1]) {
        		map.put(edge[i][1],edge[i][0]);
        	} else {
        		map.put(edge[i][0],edge[i][1]);
        	}
        }
        Iterator<Entry<Integer, Integer>> set = map.entrySet().iterator();
        if(set.hasNext()) {
        	
        }
        
        
        
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}