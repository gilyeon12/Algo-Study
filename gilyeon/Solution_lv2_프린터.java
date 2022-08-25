package com.ssafy.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

public class Solution_lv2_프린터 {

	public static void main(String[] args) {
		int[] priorities = { 1, 1, 9, 1, 1, 1 };
		int location = 0;
		int res = solution1(priorities, location);
		System.out.println(res);
	}

	private static int solution1(int[] priorities, int location) {
		/*
		 * 아래 예제를 스택으로 구현해보았다. 근데 location을 못찾고 배열을 벗어나면 다시 i를 0으로 되돌려주는 조건문을 써주는게
		 * 필요해보인다.
		 */
		int answer = 1;
		int[] copy = new int[priorities.length];
		for (int i = 0; i < copy.length; i++) {
			copy[i] = priorities[i];
		}
		Arrays.sort(copy);
		Stack<Integer> stack = new Stack<>();
		for (int t : copy) {
			stack.push(t);
		}

		while (!stack.isEmpty()) {
			for (int i = 0; i < priorities.length; i++) {
				if (stack.peek() == priorities[i]) {
//					if (i > priorities.length - 1) {
//						i = 0;
//						break;
//					}
					if (location == i)
						return answer;
					answer++;
					stack.pop();
				}
			}
		}

		return answer;
	}

	private static int solution2(int[] priorities, int location) {
		/* 우선순위 큐를 활용한 예제 */
		int answer = 1;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Comparator.reverseOrder());
		for (int n : priorities)
			queue.offer(n);

		while (!queue.isEmpty()) {
			for (int i = 0; i < priorities.length; i++) {
				if (queue.peek() == priorities[i]) {
					if (location == i)
						return answer;
					answer++;
					queue.poll();
				}
			}
		}

		return answer;
	}
}
