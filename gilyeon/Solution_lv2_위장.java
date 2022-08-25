package com.ssafy.study;

import java.util.HashMap;
import java.util.Iterator;

public class Solution_lv2_위장 {
	/* HashMap.put(Key, Value) : Hash Map에 Key와 Value를 한 쌍으로 입력하는 함수 */
	public static void main(String[] args) {
		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
		int res = solution(clothes);
		System.out.println(res);
	}

	private static int solution(String[][] clothes) {
		// 1. 옷을 종류별로 구분하기
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < clothes.length; i++) {
			String key = clothes[i][1];
			if (!map.containsKey(key)) {
				map.put(key, 1);
			} else {
				map.put(key, map.get(key) + 1);
			}
		}
//		for (String[] clothe : clothes) {
//		String type = clothe[1];
//		map.put(type, map.getOrDefault(type, 0) + 1);
//	}
		// 2. 입지 않는 경우를 추가하여 모든 조합 계산하기
		Iterator<Integer> it = map.values().iterator();
		int answer = 1;

		while (it.hasNext())
			answer *= it.next().intValue() + 1;

		// 3. 아무종류의 옷도 입지 않는 경우 제외하기
		return answer - 1;
	}

}
