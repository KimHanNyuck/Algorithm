
public class Carpet {
	public int[] solution(int brown, int yellow) {
        int[] answer = {};
        boolean why = false;
        for(int i = 1 ; i <= brown/2 ; i ++){
        	for(int j = 1 ; j <= brown/2 ; j++) {
        		if(i*j==brown+yellow && (i+2)*(j+2)==yellow) {
        			answer = new int [] {j , i};
        			System.out.println(i+"/"+j);
        			why = true;
        		}
        	}
        	if(why) {
        		break;
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carpet cp = new Carpet();
		cp.solution(24, 24);
	}

}
