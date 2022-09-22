
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int matched = 0;

        // for-each문 사용!
        for(int l : lottos) {  
            if (l == 0) {
                zero++;
            } else {
                for(int w : win_nums) {
                    if (l == w) {
                        matched++;
                        break;  // 없어도 실행 가능
                    }
                }
            }
        }

        int min = matched;
        int max = matched + zero;

        int[] answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};
        // Math.min 함수 사용하기(두 값 중 작은 값 리턴)
        // int[] answer = {(7 - max), (7 - min)};
        // 위 주석처럼하면 7이 리턴될 수도 있는데,
        // rank에는 7위가 없어서 min함수로 꼭 6이랑 비교해줘야 함
        return answer;
    }
}

