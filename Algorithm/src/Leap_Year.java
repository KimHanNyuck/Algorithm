
public class Leap_Year {
	public String solution(int a, int b) {
        String answer = "";
        String[] day = new String[] {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        String[][] calendar  = new String[12][31];
        int days = 0;
        for(int i = 0 ; i < calendar.length; i ++) {
        	for(int j = 0 ; j < calendar[i].length ; j++) {
        		calendar[i][j] = day[days%7];
        		days++;
        		switch(i) {
        		case 0: if(j==30) j=40; break;
        		case 1: if(j==28) j=40; break;
        		case 2: if(j==30) j=40; break;
        		case 3: if(j==29) j=40; break;
        		case 4: if(j==30) j=40; break;
        		case 5: if(j==29) j=40; break;
        		case 6: if(j==30) j=40; break;
        		case 7: if(j==29) j=40; break;
        		case 8: if(j==30) j=40; break;
        		case 9: if(j==30) j=40; break;
        		case 10: if(j==29) j=40; break;
        		case 11: if(j==30) j=40; break;
        		
        		}
        	}
        }
        answer = calendar[a-1][b-1];
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leap_Year ly = new Leap_Year();
		ly.solution(5, 24);
	}

}
