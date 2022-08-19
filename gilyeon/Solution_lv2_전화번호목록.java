package com.ssafy.study;

import java.util.Arrays;

public class Solution_lv2_전화번호목록 {

	public static void main(String[] args) {
		String[] phone_book = { "119", "97674223", "1195524421" };
		boolean res = solution2(phone_book);
		System.out.println(res);
	}

	private static boolean solution1(String[] phone_book) {
		/*
		 * 첫번째 시도 정확성: 70.8 (테케 8,9,19 틀림) 효율성: 8.3 합계: 79.2 / 100.0
		 */
		boolean answer = true;
		for (int i = 0; i < phone_book.length; i++) {
			for (int j = i + 1; j < phone_book.length; j++) {
				if (phone_book[i].length() > phone_book[j].length())
					continue;
				String first = phone_book[j].substring(0, phone_book[i].length()); // 접두사
				if (first.equals(phone_book[i])) {
					answer = false;
					break;
				}
			}
			if (answer == false)
				break;
		}
		return answer;
	}

	private static boolean solution2(String[] phone_book) {
		/*
		 * 두번째 시도 정확성: 정답!!
		 * 전 시도와 달라진 점: 배열 정렬 추가, 정렬 후 다음 것 하나만 찾기 (반복문을 하나로)
		 * 알게된 점 : 사전순으로 정렬이 됨.(ex.119 -> 1195524421 -> 97674223)
		 * 따라서 같은 접두사들끼리 묶여있게되기 때문에 다음 것 하나만 찾아도 문제가 없고 효율성도 높아진다.
		 */
		boolean answer = true;
		Arrays.sort(phone_book);
		for (String string : phone_book) {
			System.out.println(string);
		}
		for (int i = 0; i < phone_book.length - 1; i++) {
			if (phone_book[i].length() > phone_book[i + 1].length()) // 비교할 문자열의 길이가 적을 때 오류나므로 continue;
				continue;
			String first = phone_book[i + 1].substring(0, phone_book[i].length()); // 접두사, startwith란 함수로 대체 가능
			if (first.equals(phone_book[i])) {
				answer = false;
				break;
			}
		}
		return answer;
	}
}
