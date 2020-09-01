
public class Arrays_Multiple {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr2[0].length];
		for(int i=0; i<answer.length; i++) {
			for(int j=0; j<answer[0].length; j++) {
				for(int z=0; z<arr1[0].length; z++) {
					answer[i][j] += arr1[i][z] * arr2[z][j];
				}
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
