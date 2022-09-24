import java.util.*;

class Solution {
    public int[] solution(long n) {        
        List<Integer> list = new ArrayList<>();

        // 10을 나누면서 일의 자리를 차례대로 list에 담으면 n을 뒤집은 순서가 된다  
        while(n > 0) {
            list.add((int)(n % 10));  // n이 long 타입이기 때문에 (int)로 형변환
            n /= 10;  // 1234 -> 123 -> 12 -> 1 -> 0.1(while문 종료)
        }

        // list를 int배열로 변환
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
