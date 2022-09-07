package com.ssafy.study;

public class Solution_lv2_카펫 {

	public static void main(String[] args) {
		int brown = 24;
		int yellow = 24;
		int[] res = solution(brown, yellow);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}

	private static int[] solution(int brown, int yellow) {
		int[] answer = { 0, 0 };
		// 1. 곱해서 yellow가 되는 2개의 수 구하기(yellow의 약수)
		for (int i = 1; i <= Math.sqrt(yellow); i++) {
			if (yellow % i == 0) {
				int h = i;
				int w = yellow / i;
				int temp = (h + 2) * 2 + w * 2; // 해당 수 일때 가장자리 카펫의 넓이
				if (temp == brown) { // 2. brown이랑 비교
					answer[0] = w + 2; // 3. 맞으면 카펫 길이 return.
					answer[1] = h + 2;
					break;
				}
			}
		}
		return answer;
	}
}
