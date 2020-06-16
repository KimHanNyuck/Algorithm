import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Longest_Node {
	public int solution(int n, int[][] edge) {
        int answer = 0;
        Map<Integer, ArrayList> map = new HashMap<Integer, ArrayList>();
        Map<Integer, ArrayList> level = new HashMap<Integer, ArrayList>();
        for(int i = 0 ; i < edge.length; i++) {
        	if(edge[i][0] > edge[i][1]) {
        		if(!map.containsKey(edge[i][1])) {
        			ArrayList list = new ArrayList();
        			list.add(edge[i][0]);
        			map.put(edge[i][1],list);
        		} else {
        			map.get(edge[i][1]).add(edge[i][0]);
        		
        		}
        	} else {
        		if(!map.containsKey(edge[i][0])) {
        			ArrayList list = new ArrayList();
        			list.add(edge[i][1]);
        			map.put(edge[i][0],list);
        		} else {
        			map.get(edge[i][0]).add(edge[i][1]);
        		}
        	}
        }
        Iterator<Integer> it = map.keySet().iterator();
        int stairs = 1;
        while(it.hasNext()) {
        	for(int i = 0 ; i < map.get(it.next()).size(); i++){
        		if(!level.containsKey(stairs)) {
        			ArrayList llist = new ArrayList<>();
            		llist.add(map.get(it.next()).get(i));
            		level.put(stairs, llist);
        		} else {
        			level.get(stairs).add(map.get(it.next()).get(i));
        		}
        		
        	}
        	stairs++;
        }
        answer = level.get(level.size()).size();
        
        
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Longest_Node ln = new Longest_Node();
		ln.solution(6, new int[][] {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}});
	}

}