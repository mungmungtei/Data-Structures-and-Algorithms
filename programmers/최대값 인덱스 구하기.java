import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        // 최대값 구하기
        int max = 0;
        for(int a : arr) if(a > max) max = a;
        
        // list 만들기
        List<Integer> list = new LinkedList<>();
        
        // 배열에 인덱스 채우기
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == max) list.add(i);
        }
        
        // list를 배열로 변환
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
