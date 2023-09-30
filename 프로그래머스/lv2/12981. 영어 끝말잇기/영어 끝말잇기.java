import java.util.ArrayList;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < words.length; i++) {
            if(list.size() == 0) {
                list.add(words[i]);
            } else {
                String end = words[i-1].substring(words[i-1].length()-1, words[i-1].length()); //끝
                String start = words[i].substring(0, 1); //시작
                
                if(end.equals(start)){
                    if(list.contains(words[i])) { //중복 단어
                        int num = i % n + 1;
                        int cnt = i / n + 1;
                        answer[0] = num; answer[1] = cnt;
                        break;
                    }   
                } else { //끝, 시작 다름
                    int num = i % n + 1;
                    int cnt = i / n + 1;
                    answer[0] = num; answer[1] = cnt;
                    break;
                }
                
                list.add(words[i]);
            }
            
        }
        
        return answer;
    }
}