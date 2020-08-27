import java.util.Stack;

public class Stock_Price {
	public int[] solution(int[] prices) {
        Stack<Integer[]> stack = new Stack<>();
        int[] answer = new int[prices.length];

        for (int i = prices.length - 2 ; i >= 0 ; i--) {
            int day = 0;

            while (!stack.isEmpty() && stack.peek()[0] >= prices[i]) {
                day += stack.pop()[1];
            }

            answer[i] = stack.push(new Integer[]{prices[i], day + 1})[1];
        }

        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
