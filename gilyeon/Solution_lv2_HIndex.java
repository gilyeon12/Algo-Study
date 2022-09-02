package com.ssafy.study;

import java.util.Arrays;

public class Solution_lv2_HIndex {

	public static void main(String[] args) {
		int[] citations = { 3, 0, 6, 1, 5 };
		int res = solution(citations);
		System.out.println(res);
	}

	private static int solution(int[] citations) {
		Arrays.sort(citations);
		int max = 0;
		for (int i = 0; i < citations.length; i++) {
			int cnt = citations.length - i; // 해당 인덱스보다 인용수가 크거나 같은 논문의 개수
			if (citations[i] >= cnt) {
				max = cnt;
				break; // 조건에 처음으로 만족하는 순간이 H-Index 최댓값이고 이후로는 무조건 cnt값이 작아지기 때문에 이후의 차례는 체크할 필요가 없다.
			}
		}
		return max;
	}
}
