package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class boj_B2_2798_블랙잭 {
	static int[] input;
	static int[] numbers = new int[3];
	static int sum;
	static int N, M;
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in = new BufferedReader(new StringReader(str));
		StringTokenizer st = new StringTokenizer(in.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		input = new int[N];
		st = new StringTokenizer(in.readLine());
		for(int i = 0; i < N; i++) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		comb(0,0);
		System.out.println(sum);
		
	}
	private static void comb(int cnt, int start) {
		if(cnt == 3) {
			int temp = 0;
			for (int i = 0; i < numbers.length; i++) {
				temp += numbers[i];
			}
			if(temp <= M) // 조합의 합이 M보다 작거나 같다면,
				sum = Math.max(temp, sum); // 합의 최댓값을 구한다.
			return;
		}
		for(int i = start; i < input.length; i++) {
			numbers[cnt] = input[i];
			comb(cnt + 1, i + 1);
		}
	}
	private static String str = "10 500\r\n" + 
			"93 181 245 214 315 36 185 138 216 295";
}
