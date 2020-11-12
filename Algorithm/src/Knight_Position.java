
public class Knight_Position {
	public int solution(String pos) {
        // Write code here.
		int answer = 0;
		int[][] arr = new int[8][8];
		int i = pos.charAt(0) - 65;
		int j = Integer.parseInt(String.valueOf(pos.charAt(1)))-1;
		try {
			arr[i+1][j+2] = 1;
			answer++;
		} catch (Exception e) {
			
		}
		try {
			arr[i-1][j+2] = 1;
			answer++;
		} catch (Exception e) {
			
		}
		try {
			arr[i+2][j+1] = 1;
			answer++;
		} catch (Exception e) {
			
		}
		try {
			arr[i+2][j-1] = 1;
			answer++;
		} catch (Exception e) {
			
		}
		try {
			arr[i-2][j+1] = 1;
			answer++;
		} catch (Exception e) {
			
		}
		try {
			arr[i-2][j-1] = 1;
			answer++;
		} catch (Exception e) {
			
		}
		try {
			arr[i+1][j-2] = 1;
			answer++;
		} catch (Exception e) {
			
		}
		try {
			arr[i-1][j-2] = 1;
			answer++;
		} catch (Exception e) {
			
		}
        
        return answer;
    }
	

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Knight_Position sol = new Knight_Position();
        String pos = "A7";
        int ret = sol.solution(pos);

        // Press Run button to receive output. 
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}