import java.util.*;

public class Solution {
    /* ���� ī�װ��� ����, ť���� �������� Ǯ���µ� arraylist�� Ǫ�°� �� ���ҵ�... */
 
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]); // stackempty�� �����ϱ� ���� ù��° ���� �ֱ�.

        for(int i = 1; i < arr.length; i++){
            if(stack.peek() == arr[i]){ // �տ� ���� ���Ҷ� ������ push ����;
                continue;
            }
            stack.push(arr[i]);
        }

        Stack<Integer> temp = new Stack<>(); // ������� ����ϱ� ���� ���� �ϳ� �� ����.
        int size = stack.size(); // stack�� pop�ϸ� ������ ũ�Ⱑ ���������� ���ϱ� ������ ���� �� ó���� ũ�⸦ ���� ������ �ϳ� �����������.
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