
public class Target_Number {
	public int solution(int[] numbers, int target) {
        int answer = 0;
        answer = dfs(numbers, 0, 0, target);
        return answer;
    }
    
    private int dfs(int[] numbers, int node, int pm, int target){
        if(node == numbers.length){
            return pm == target ? 1 : 0;
        }
        return dfs(numbers, node+1, pm + numbers[node], target) 
        	 + dfs(numbers, node+1, pm - numbers[node], target);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
