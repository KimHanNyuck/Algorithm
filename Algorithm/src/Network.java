
public class Network {
	public int solution(int n, int[][] computers) {
        int answer = 0;
        int sum = 0 ;
        boolean[] connect = new boolean[computers.length];
        for(int i = 0 ; i < computers.length ; i ++) {
        	connect[i] = false;
        	for(int j = 0 ; j < computers[0].length ; j++) {
        		if(computers[i][j]==1) {
        			sum++;
        		}
        	}
        }
        if(sum == n) {
        	return n;
        } else if(sum == n*n){
        	return 1;
        } else if(n==1) {
        	return 1;
        } else {
        	for(int i = 0 ; i < computers.length ; i ++) {
        		if(connect[i] == false){
                    answer++;
                    dfs(i, connect, computers);
                }     
        	}
        }
        return answer;
    }
	
	public void dfs(int node, boolean[] visited, int[][] computers){
        visited[node] = true;
        
        for(int i = 0; i < computers.length; i++){
            if(visited[i] == false && computers[node][i] == 1){
                dfs(i, visited, computers);
            }
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Network nt = new Network();
		nt.solution(3, new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});
	}

}
