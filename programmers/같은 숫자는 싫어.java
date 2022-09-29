import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        
        // 연속된 같은 숫자만 제거해야하니깐 Set 사용 불가
        // 배열의 순서를 유지해야하니깐 List 사용하기
        List<Integer> list = new ArrayList<>();
        
        // 배열을 돌면서 연속된 다른 숫자만 리스트에 담아주기 
        int a = -1;
        for(int i = 0; i < arr.length; i++) {
            if(a != arr[i]) {
                a = arr[i];
                list.add(arr[i]);
            } 
        }
        // 리스트를 다시 int 배열로 바꿔주기
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
