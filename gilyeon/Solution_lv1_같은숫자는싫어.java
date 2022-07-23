import java.util.*;

public class Solution {
    /* 문제 카테고리가 스택, 큐에서 스택으로 풀었는데 arraylist로 푸는게 더 편할듯... */
 
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]); // stackempty를 방지하기 위해 첫번째 원소 넣기.

        for(int i = 1; i < arr.length; i++){
            if(stack.peek() == arr[i]){ // 앞에 넣은 원소랑 같으면 push 안함;
                continue;
            }
            stack.push(arr[i]);
        }

        Stack<Integer> temp = new Stack<>(); // 순서대로 출력하기 위해 스택 하나 더 선언.
        int size = stack.size(); // stack을 pop하면 스택의 크기가 유동적으로 변하기 때문에 스택 맨 처음의 크기를 담을 변수를 하나 선언해줘야함.
        for(int i = 0; i < size; i++){
            temp.push(stack.pop()); 
        }

        int [] answer = new int[temp.size()];
        for(int i = 0; i < size; i++){
            answer[i] = temp.pop();
        }

        return answer;
    }
}