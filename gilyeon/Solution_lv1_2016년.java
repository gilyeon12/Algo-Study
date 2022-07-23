class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int [] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int day = -1;
        for(int i = 0; i < a-1; i++){
            day += month[i];
        }
        day += b;
        // 요일을 배열로 생성해서 출력하면 더 좋음.	
        switch(day%7){
            case 0:
                answer += "FRI";
                break;
            case 1:
                answer += "SAT";
                break;
            case 2:
                answer += "SUN";
                break;
            case 3:
                answer += "MON";
                break;
            case 4:
                answer += "TUE";
                break;
            case 5:
                answer += "WED";
                break;
            case 6:
                answer += "THU";
                break;
        }
        return answer;
    }
}