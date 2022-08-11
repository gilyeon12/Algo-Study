package com.ssafy.study;

public class Solution_lv2_다음큰숫자 {
	public static void main(String[] args) {
		int answer = solution(78);
		System.out.println(answer);
	}
	/* 10진수(숫자) -> 2진수 변환(문자열) : Integer.toBinaryString(10진수 숫자 변수)
	 * 2진수(문자열) -> 10진수 변환(숫자) : Integer.parseInt(2진수 문자열 변수, 변환할 진수)
	 */
	public static int solution(int n) {
        int answer = 0;
        int count = 0;
        String binary = Integer.toBinaryString(n);
        for(int i = 0; i < binary.length(); i++) {
        	if(binary.charAt(i)=='1')
        		count++;
        }
        
        while(true) {
        	n++;
        	String temp_binary = Integer.toBinaryString(n);
        	int temp_count = 0;
        	for(int i = 0; i < temp_binary.length(); i++) {
            	if(temp_binary.charAt(i)=='1')
            		temp_count++;
            }
        	
        	if(count == temp_count) {
        		answer = Integer.parseInt(temp_binary, 2);
        		break;
        	}

        }
        return answer;
    }
}
