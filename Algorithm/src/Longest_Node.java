import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Longest_Node {
	public int solution(int n, int[][] edge) {
        int answer = 0;
        boolean[] visit = new boolean[n+1];
        boolean[][] connected = new boolean[n+1][n+1];
        for(int i = 0; i < edge.length; i++) {
            connected[edge[i][0]][edge[i][1]] = connected[edge[i][1]][edge[i][0]] = true;
        }
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> nextNodes = new ArrayList<>();
        queue.add(1);
        visit[0] = visit[1] = true;
        while(true) {
            answer = queue.size();
            while(!queue.isEmpty()) {
                int node = queue.poll();
                for(int j = 1; j <= n; j++) {
                    if(!visit[j] && connected[node][j]) {
                        nextNodes.add(j);
                        visit[j] = true;
                    }
                }
            }
            if(nextNodes.isEmpty()) {
                break;
            }
            queue.addAll(nextNodes);
            nextNodes.clear();
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Longest_Node ln = new Longest_Node();
		ln.solution(6, new int[][] {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}});
	}

}