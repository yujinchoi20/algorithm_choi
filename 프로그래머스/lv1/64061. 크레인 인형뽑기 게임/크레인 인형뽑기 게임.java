import java.util.Stack;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < moves.length; i++) {
            int box = moves[i] - 1; //index로 사용

            for(int j = 0; j < board.length; j++) {
                if(board[j][box] != 0) {
                    if(stack.size() > 0) {
                        if(board[j][box] == stack.peek()){ //같은 인형일 경우
                            stack.pop(); //없애기
                            answer += 2; //인형 개수
                        } else {
                            stack.push(board[j][box]);
                        }
                    } else {
                        stack.push(board[j][box]);
                    }
                    
                    board[j][box] = 0; //인형이 옮겨졌기에 빈칸으로 표시
                    break; //0이 아닌 값을 찾으면 탈출
                }
            }
        }
        return answer;
    }
}