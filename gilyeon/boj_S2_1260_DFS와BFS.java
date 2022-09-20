package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class boj_S2_1260_DFS와BFS {

	static int N, M, V;
	static int[][] arr;
	static boolean[] visited;

	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in = new BufferedReader(new StringReader(str));
		StringTokenizer st = new StringTokenizer(in.readLine());
		N = Integer.parseInt(st.nextToken()); // 노드의 개수
		M = Integer.parseInt(st.nextToken()); // 간선의 개수
		V = Integer.parseInt(st.nextToken()); // 처음 시작하는 노드

		arr = new int[N + 1][N + 1]; // 노드 간에 간선을 표현한 배열
		visited = new boolean[N + 1]; // 방문한 노드의 상태를 나타내는 배열

		for (int i = 0; i < M; i++) { // 노드 간에 간선을 표현해주기
			st = new StringTokenizer(in.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] = 1;
		}

		dfs(V);
		sb.append("\n");
		visited = new boolean[N + 1]; // 방문 배열 초기화
		bfs(V);
		System.out.println(sb);
	}

	private static void dfs(int start) { // 재귀를 이용한 방법
		visited[start] = true;
		sb.append(start + " ");

		for (int i = 0; i <= N; i++) {
			if (!visited[i] && arr[start][i] == 1) // 인접한 노드 중 이미 방문하지 않은 노드라면 방문
				dfs(i);
		}
	}

	private static void bfs(int start) { // 큐를 이용
		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(start);
		visited[start] = true;

		while (!queue.isEmpty()) { 
			start = queue.poll();
			sb.append(start + " ");

			for (int i = 1; i <= N; i++) {
				if (!visited[i] && arr[start][i] == 1) { /// 인접한 노드 중 이미 방문하지 않은 노드라면 모두 큐에 넣어줌.
					queue.add(i);
					visited[i] = true;
				}
			}
		}

	}

	private static String str = "4 5 1\r\n" + "1 2\r\n" + "1 3\r\n" + "1 4\r\n" + "2 4\r\n" + "3 4";
}
