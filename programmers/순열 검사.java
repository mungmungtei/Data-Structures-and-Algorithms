import java.util.Arrays;

class Solution {
    public boolean solution(int[] arr) {
        boolean answer = true;
        Arrays.sort(arr);  // 배열을 오름차순으로 정렬

        for(int i = 0; i < arr.length; i++) {
            // 숫자가 중복 없이 들어가 있다면 0번째 숫자는 1, 1번째 숫자는 2..
            if(arr[i] != i+1)  {
                answer = false;
                break;
            }
        }

        return answer;
    }
}
