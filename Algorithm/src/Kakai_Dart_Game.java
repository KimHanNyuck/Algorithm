import java.util.ArrayList;
import java.util.List;

public class Kakai_Dart_Game {
	public int solution(String dartResult) {
        int answer = 0;
        List<Integer> list = new ArrayList<Integer>();
        int number = 0;
        for(int i = 0 ; i < dartResult.length()-1 ; i++) {
        	if(dartResult.charAt(i) >= '0' && dartResult.charAt(i) <= '9') {
        		number = Integer.parseInt(String.valueOf(dartResult.charAt(i)));
        		if(dartResult.charAt(i+1) >= '0' && dartResult.charAt(i+1) <= '9') {
        			number = Integer.parseInt(String.valueOf(dartResult.charAt(i))+String.valueOf(dartResult.charAt(i+1)));
        			i++;
        		}
        		list.add(number);
        	}
        }
        
        int room = 0 ;
        for(int i = 0 ; i < dartResult.length() ; i ++) {
        	if(String.valueOf(dartResult.charAt(i)).equals("S") || (String.valueOf(dartResult.charAt(i)).equals("D")) || String.valueOf(dartResult.charAt(i)).equals("T")) {
        		if(String.valueOf(dartResult.charAt(i)).equals("S")) {
        			
        		} else if(String.valueOf(dartResult.charAt(i)).equals("D")) {
        			list.set(room, (int)Math.pow((double)list.get(room), 2));
        		} else if(String.valueOf(dartResult.charAt(i)).equals("T")) {
            		list.set(room, (int)Math.pow((double)list.get(room), 3));
        		}
        		if(i== dartResult.length()-1) {
        			break;
        		}
        		if(String.valueOf(dartResult.charAt(i+1)).equals("*")) {
        			list.set(room, list.get(room)*2);
        			try {
        				list.set(room-1, list.get(room-1)*2);
					} catch (Exception e) {
						// TODO: handle exception
					}
        		} else if (String.valueOf(dartResult.charAt(i+1)).equals("#")) {
        			list.set(room, list.get(room)*-1);
        		}
        		room++;
        	} 
        }
        for(int i = 0 ; i < list.size() ; i ++) {
        	System.out.println(list.get(i));
        }
        answer = list.stream().reduce((a,b) -> {return Integer.sum(a, b);}).orElse(-1);
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kakai_Dart_Game kd = new Kakai_Dart_Game();
		kd.solution("1S2D*3T");
	}

}
