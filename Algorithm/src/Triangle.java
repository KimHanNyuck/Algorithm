
public class Triangle {
	public int[] solution(int n) {
        int[] answer = new int[n];
        int[][] map = new int[n][n];
        return answer;
    }
	public int[][] makeTriangle(int[][] arr, int i , int j, int k) {
		if(i == j && i==0) {
			arr[i][j] = 1;
			k = 2;
			makeTriangle(arr, i++, j, k);
		} else {
			if(i <= arr.length-1 && arr[i][j] == 0) {
				arr[i][j] = k;
				if(i== arr.length-1) {
					makeTriangle(arr, i, j++, k++);
				} else {
					makeTriangle(arr, i++, j, k++);
				}
			}
			if(j <= arr.length-1-(r) && arr[i][j] == 0) {
				arr[i][j] = k
				if()
			}
		}
		
		
		return new int[][] {};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
