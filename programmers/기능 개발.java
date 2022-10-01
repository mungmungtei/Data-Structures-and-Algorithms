import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
 
        // 진도율 [93, 30, 55] , 속도 [1, 30, 5]
        // 필요한 작업 일수 [7, 3, 9]
        // 일별 배포 개수 [2, 1]
        
        // 순서대로 처리해야하니깐 Queue 사용
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < progresses.length; i++) {
            // 소수점으로 나오면 올림해야 하니깐 float로 타입 변경
            float p = progresses[i];
            float s = speeds[i];
            int days = (int) Math.ceil((100 - p) / s);
            queue.offer(days);  // queue에 [7,3,9] 담긴 상태
        }
        
        Queue<Integer> answer = new LinkedList<>();
        int a = queue.poll();
        int count = 1;
        while(!queue.isEmpty()) {
            int b = queue.poll();
            if(a >= b) {
                count++;
                continue;
            }
            answer.offer(count);
            count = 1;
            a = b;
        }
        answer.offer(count);  // answer에 [2,1] 담긴 상태

        // int 배열로 바꿔주기
        return answer.stream().mapToInt(Integer::intValue).toArray();   
    }
}
