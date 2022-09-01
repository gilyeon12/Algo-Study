package com.ssafy.study;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_lv2_다리를지나는트럭 {

	public static void main(String[] args) {
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = { 7, 4, 5, 6 };
		int res = solution(bridge_length, weight, truck_weights);
		System.out.println(res);
	}

	private static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = bridge_length;
		Queue<Integer> queue1 = new LinkedList<Integer>(); // 대기 트럭
		Queue<Integer> queue2 = new LinkedList<Integer>(); // 다리를 건너는 트럭
		for (int i : truck_weights) {
			queue1.offer(i);
		}

		int bridge_weight = 0; // 현재 다리의 무게

		while (!queue1.isEmpty()) { // 트럭들이 다리를 다 건너지 않았을 경우

			int temp = 0; // 곧 다리를 건널 트럭(queue1의 맨 왼쪽) 
			if (queue2.isEmpty()) { // 다리를 건너는 트럭이 하나도 없을 경우
				temp = queue1.poll(); 
				queue2.offer(temp); // 트럭이 다리를 건넌다.
				bridge_weight += temp; // 다리의 무게를 트럭의 무게만큼 더해준다.
			} else { // 다리를 건너는 트럭이 있을 경우
				if (queue2.size() == bridge_length) { // 다리 안에 있는 트럭의 수가 꽉 찼다면
					temp = queue2.poll(); // 트럭은 다리를 다 건넌다.
					bridge_weight -= temp; // 그 무게만큼 다리 무게를 빼준다.
				}
				if (bridge_weight + queue1.peek() > weight) { // 다음 트럭이 오면 다리의 최대 무게를 넘어갈 경우
					if (bridge_weight > weight) { 
						bridge_weight -= queue2.poll(); // 트럭은 다리를 다 건너고 그 무게만큼 다리 무게를 빼준다.
					} else { 
						queue2.offer(0); // 큐에 0을 대입해 트럭의 위치는 옮기고 무게에도 영향이 안가게 해준다.
					}
				} else { // 다음 트럭이 와도 다리의 최대 무게를 넘어가지 않는 경우(그러니깐 다음 트럭이 다리를 지나도 될 경우)
					temp = queue1.poll(); 
					queue2.offer(temp); // 트럭이 다리를 건넌다.
					bridge_weight += temp; // 다리의 무게를 트럭의 무게만큼 더해준다.
				}
			}
			answer++; // 트럭의 각 이동 횟수를 카운트한다.
		}
		return answer;
	}
}
