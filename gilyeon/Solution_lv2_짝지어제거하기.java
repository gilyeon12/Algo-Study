package com.ssafy.study;

import java.util.ArrayList;
import java.util.Stack;

public class Solution_lv2_짝지어제거하기 {

	public static void main(String[] args) {
		String s = "baabaa";
		int res = solution2(s);
		System.out.println(res);
	}

	private static int solution1(String s) { // 배열 리스트로 풀기 -> 해결 X
		int answer = 0;

		ArrayList<Character> arr = new ArrayList<>();
		for (char i = 0; i < s.length(); i++) {
			arr.add(s.charAt(i));
		}

		int size = arr.size();
		while (true) {
			if (size == 0) {
				answer = 1;
				break;
			}
			for (int i = 0; i < size - 1; i++) {
				if (arr.get(i) == arr.get(i + 1)) {
					arr.remove(i); // 헐 아마 앞의 문자를 제거한 뒤 뒤 문자도 제거할 때 주소값이 꼬인듯;;
					arr.remove(i + 1); // 해결 방법 : 뒤의 문자부터 제거!!
					size -= 2;
					break;
				}
			}
		}

		return answer;
	}

	private static int solution2(String s) { // 스택으로 풀기 -> 배열 리스트는 포기하고 스택으로 풀었다^^;
		int answer = 0;

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
				stack.pop();
			} else // 스택이 비어있으면 push
				stack.push(s.charAt(i));
		}

		if (stack.isEmpty())
			answer = 1;
		return answer;
	}
}
