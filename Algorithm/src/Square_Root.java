import java.util.*;
public class Square_Root {
	public long solution(long n) {
        return Math.sqrt(n)==(long)Math.sqrt(n) ? (long)Math.pow(Math.sqrt(n)+1, 2) : -1 ;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println((long)Math.sqrt(14)== Math.sqrt(14));
	}

}
