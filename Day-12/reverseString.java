import java.util.ArrayList;
import java.util.Collections;
public class reverseString {
    public static void main(String[] args) {
        String str = "the sky is blue ";
        str = str.trim();
        String [] stlist = str.split(" +");
        ArrayList<String> seen = new ArrayList<>();
        for(String itr : stlist){
            seen.add(itr);
        }
        Collections.reverse(seen);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<seen.size();i++){
            sb.append(seen.get(i));
            if(i<seen.size()-1){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
