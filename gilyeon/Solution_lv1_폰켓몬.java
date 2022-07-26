import java.util.*;
class Solution {
    // HashSet을 사용하면 알아서 중복이 제거되므로 더 편리함!!
    public int solution(int[] nums) {
        int type = 1;

        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] != nums[i])
                type++;
        }

        if(type > nums.length/2)
            return nums.length/2;
        return type;
    }
}