package com.ssafy.study;

public class Solution_lv2_124나라 {

	public static void main(String[] args) {
		String res = solution(5);
		System.out.println(res);
	}

	private static String solution(int n) {
		// 따로 1,2,4를 담을 배열을 선언하는 방법도 ok!
		StringBuilder sb = new StringBuilder();
		int r; // 나머지
		// 나머지를 기준으로 문자열을 저장
		while (n > 0) {
			r = n % 3;
			if (r == 1) {
				sb.append(1);
			} else if (r == 2) {
				sb.append(2);
			} else { // 3으로 나누어 떨어지면,
				n--; // n에 1을 빼준다.
				sb.append(4);
			}

			n = n / 3;
		}
		String answer = sb.reverse().toString();
		return answer;
	}
}
