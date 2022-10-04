import java.util.*;

class Solution {
    
    // 우선순위 + 내 문서인지 아닌지 동시에 확인해야하기 때문에 
    // 두 데이터를 묶는 새로운 자료구조 만들어 활용
    class Paper {
        int priority;
        boolean isMine;

        Paper(int p, boolean m) {
            priority = p;
            isMine = m;
        }
    }
    
    public int solution(int[] priorities, int location) {
        
        // 중간값도 꺼내와야 하기 때문에 Queue 대신 List 사용
        List<Paper> queue = new LinkedList<>();
        for(int i=0; i<priorities.length; i++) {
            // i==location 이면 true, 아니면 false 반환함으로써 내 문서인지 아닌지 확인할 수 있음
            queue.add(new Paper(priorities[i], i==location));
        }
        
        int answer = 0;
        while(!queue.isEmpty()) {
            Paper now = queue.remove(0);  // 맨 앞에 값 꺼내오기
            
            // 꺼내온 값의 우선순위를 대기목록과 비교하여 출력할지 말지 결정하기
            boolean printable = true;
            for(Paper p : queue) {
                if(now.priority < p.priority) {
                    printable = false;
                    break;
                }
            }
            
            // printable이 false면 대기목록의 맨 뒤에 다시 넣기 
            if(!printable) {
                queue.add(now);
                continue;
            }
            
            // printable이 true면 인쇄순서에 +1 하기
            answer++;
            // 내 문서라면 answer 리턴, 아니면 answer만 증가시키고 다시 반복문 진행
            if(now.isMine) return answer;
        }
        
        return answer;
    }
}
