public class Solution_lv2_주식가격 {
	/*스택,큐 문제지만 이중 반복문으로 충분히 풀 수 있을거 같아서 그렇게 풀었다. 다만 시간 초과를 잡는 것이 관건인듯!!!!!
	 * 문제가 가격이 떨어지지 않은 기간을 물어봤으니 가격이 떨어지고 난 후 기간을 측정하지 않아도 된다. 
	 * 문제를 이해하는 것도 좀 어려웠다.
	 */

	public static void main(String[] args) {
		int[] price = { 1, 2, 3, 2, 3 };
		solution(price);
	}

	private static int[] solution(int[] prices) {
		int answer[] = new int[prices.length];
		for (int i = 0; i < prices.length; i++) {
			int count = 0;
			for (int j = i + 1; j < prices.length; j++) {
				count++;
				if (prices[i] > prices[j]) { // 원래는 prices[i] <= prices[j]로 조건을 뒀으나 시간초과! 따라서 break문을 쓰는 방법으로 조건을 고쳐주었다.
					break;
				}
			}
			answer[i] = count;
		}
//		for (int i : answer) {
//			System.out.print(i + " ");
//		}
		return answer;
	}

}
