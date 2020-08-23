
public class Kakao_Keypad {
	public String solution(int[] numbers, String hand) {
        String answer = "";
        String left="-1,-2", right="1,-2", number="";
        for(int i = 0 ; i < numbers.length ; i ++) {
        	switch(numbers[i]) {
        	case 0: number="0,-2"; break;
    		case 1: number="-1,1"; break;
    		case 2: number="0,1"; break;
    		case 3: number="1,1"; break;
    		case 4: number="-1,0"; break;
    		case 5: number="0,0"; break;
    		case 6: number="1,0"; break;
    		case 7: number="-1,-1"; break;
    		case 8: number="0,-1"; break;
    		case 9: number="1,-1"; break;
    		}
        	if(numbers[i]%3 ==1) {
        		left = number;
        		answer+="L";
        	} else if(numbers[i]%3 ==0 && numbers[i]!=0) {
        		right = number;
        		answer+="R";
        	} else if(numbers[i]%3 ==2 || numbers[i]==0){
        		if(Math.abs(Integer.parseInt(number.split(",")[0])-Integer.parseInt(right.split(",")[0]))+Math.abs(Integer.parseInt(number.split(",")[1])-Integer.parseInt(right.split(",")[1]))<Math.abs(Integer.parseInt(number.split(",")[0])-Integer.parseInt(left.split(",")[0]))+Math.abs(Integer.parseInt(number.split(",")[1])-Integer.parseInt(left.split(",")[1]))) {
        			right = number;
        			answer +="R";
        		} else if(Math.abs(Integer.parseInt(number.split(",")[0])-Integer.parseInt(right.split(",")[0]))+Math.abs(Integer.parseInt(number.split(",")[1])-Integer.parseInt(right.split(",")[1]))>Math.abs(Integer.parseInt(number.split(",")[0])-Integer.parseInt(left.split(",")[0]))+Math.abs(Integer.parseInt(number.split(",")[1])-Integer.parseInt(left.split(",")[1]))) {
        			left = number;
        			answer += "L";
        		} else {
        			if(hand.equals("right")) {
        				right = number;
        				answer +="R";
        			} else {
        				left = number;
        				answer += "L";
        			}
        		}
        	} 
        }
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kakao_Keypad kk = new Kakao_Keypad();
		System.out.println(kk.solution(new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2}, "left"));
	}// "LRLLRRLLLRR"

}
