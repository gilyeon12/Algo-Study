package com.ssafy.study;

import java.util.ArrayList;

public class Solution_lv2_기능개발 {

	public static void main(String[] args) {
		int[] progresses = { 95, 90, 99, 99, 80, 99 };
		int[] speeds = { 1, 1, 1, 1, 1, 1 };
		int[] res = solution(progresses, speeds);
		for (int i : res) {
			System.out.println(i);
		}
	}

	private static int[] solution(int[] progresses, int[] speeds) {
		// 1. 각 작업의 배포일 구하기
		int[] day = new int[progresses.length]; // 각 작업의 배포일을 담을 배열
		for (int i = 0; i < day.length; i++) {
			int temp = (100 - progresses[i]) / speeds[i]; // 몫
			int r = (100 - progresses[i]) % speeds[i]; // 나머지
			if (r == 0)
				day[i] = temp;
			else {
				day[i] = temp + 1;
			}
		}

		// 2. 각 배포마다 몇 개의 기능이 배포되는지 구하기
		// 해당 인덱스 값보다 작은 인덱스 값까지의 개수를 구한다.
		ArrayList<Integer> list = new ArrayList<>();
		int prev = day[0]; // 그 전에 배포한 일수 (이걸 기준으로 계산)
		int count = 1;
		for (int i = 1; i < day.length; i++) {
			if (prev < day[i]) { // 그 전에 배포한 일수보다 더 크다면,
				list.add(count);
				count = 1;
				prev = day[i]; // prev 변수를 새로 갱신
			} else { // 더 작다면 더 큰 값이 나올때까지 count 증가
				count++;
			}
		}
		list.add(count);

		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}

}
