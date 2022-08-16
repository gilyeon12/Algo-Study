import java.util.Stack;

public class Solution_lv2_올바른괄호 {

	public static void main(String[] args) {
		boolean res = solution(")()(");
		System.out.println(res);
	}

	static boolean solution(String s) {
		/* 여러 가지 풀이 방법이 있었으나 (ex. 여는 괄호는 count++, 닫는 괄호를 count-- 해서 count==0이면 true.) 허점이 있었음.
		 * 따라서 올바른 괄호이면 스택에 넣고 아니면 제거하는 방식으로 구현.
		 */
		boolean answer = true;
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') { // 여는 괄호이면,
				stack.push(s.charAt(i));
			}

			if (s.charAt(i) == ')') {
				if (stack.size() == 0) { // 맨 처음이 닫는 괄호라면, 바로 false
					return false;
				} else // 스택에서 괄호를 제거
					stack.pop();
			}
		}
		if (stack.size() != 0)
			answer = false;

		return answer;
	}
}
