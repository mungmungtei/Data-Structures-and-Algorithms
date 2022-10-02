class Solution {
    public int[] solution(int[] prices) {
        
        int[] answer = new int[prices.length];
        
        for(int i = 0; i < prices.length; i++) {
            // 이중 for문 돌면서 비교 대상을 그 뒷순서부터 차례대로 끝까지 비교하기
            int seconds = 0;
            for(int j = i+1; j < prices.length; j++) {
                // 바로 가격이 떨어져도 1초간은 유지한 것으로 보기 때문에 ++를 앞에 두기
                seconds++;
                // 가격이 떨어지면 반복문 종료
                if(prices[i] > prices[j]) 
                    break;
            }
            answer[i] = seconds;
        }
        return answer;
    }
}
