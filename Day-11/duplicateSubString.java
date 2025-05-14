package Day11;

import java.util.ArrayList;

public class duplicateSubString {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        String str = "pwwkew";
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(list.contains(ch)){
                continue;
            }
            list.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i));
        }
        String newStr = sb.toString();
        System.out.println("String without duplicates: " + newStr);
    }
}
