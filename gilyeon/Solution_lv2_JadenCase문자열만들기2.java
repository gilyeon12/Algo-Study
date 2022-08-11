package com.ssafy.study;

public class Solution_lv2_JadenCase문자열만들기2 {

	public static void main(String[] args) {
		String s = "    this  is book ";
		String[] str = s.toLowerCase().split(" ", -1); // 모든 공백을 기준으로 단어를 나눠주고 소문자로 변환.
		// split 두번쨰 인자가 음수면 구분자 사이에 내용이 없어도 전부 나눠줌. 공백 또한 데이터로 보고 전부 나눠준다.(문장 끝에 공백이 있을때도 처리)
		// split는 구분자가 1개 이상이면 2번째 구분자부터는 그냥 문자열로 취급함.
//		for (int i = 0; i < str.length; i++) {
//			if(str[i].length() == 0)
//				System.out.print("공백");
//			System.out.printf("str[%d] : " + str[i] + "\n", i);
//		}
		for (int i = 0; i < str.length; i++) {
			if (str[i].length() >= 1) { // 문자 양 끝의 공백이 있거나 중간에 공백 1개 이상이 있을때 -> str[i].length() == 0 일떄,
				char[] c = str[i].toCharArray();
				c[0] = Character.toUpperCase(c[0]);
				str[i] = new String(c);
			}
		}
		String result = str[0];
		for (int i = 1; i < str.length; i++) {
			result += " " + str[i];
		}
		System.out.println(result);
	}
}
