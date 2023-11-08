import java.util.ArrayList;

class Solution {
    static ArrayList<String> list1 = new ArrayList<>();
    static ArrayList<String> list2 = new ArrayList<>();
    static int intersection = 0;
    static int union = 0;
    
    public int solution(String str1, String str2) {
        int answer = 0;
        int div = 65536;
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        String[] arr1 = splitStr(str1);
        String[] arr2 = splitStr(str2);
        
        check(arr1, list1);
        check(arr2, list2);
        
        countInter();
        countUnion();
        
        double jcard = 0;
        
        if(union == 0) {
            jcard = 1;
        } else {
            jcard = (double) intersection / (double) union;
        } 
        
        answer = (int) (jcard * div);
        
        return answer;
    }
    
    public String[] splitStr(String str) { //2글자씩 끊어서 저장
        int n = str.length();
        String[] arr = new String[n-1];
        
        for(int i = 0; i < n-1; i++) {
            arr[i] = str.substring(i, i+2);
        }
        
        return arr;
    }
    
    public void check(String[] arr, ArrayList<String> list) { //영문자만 있는지 확인
        String reg = "^[a-zA-Z]*$"; //정규표현식
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].matches(reg)) { //영문자만 있으면 list에 저장
                list.add(arr[i]);
            }
        }
    }
    
    public void countInter() { //교집합 갯수 구하기
        for(String s : list1) {
            if(list2.remove(s)) {
                intersection++;
            }
            union++;
        }
    }
    
    public void countUnion() { //합집합 갯수 구하기
        for(String s : list2) {
            union++;
        }
    }
}