package Day11;

public class Strings1 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String upperCaseStr=" ";
        String lowerCaseStr=" ";
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                upperCaseStr += ch;
            }
            else if(ch >= 'a' && ch <= 'z'){
                lowerCaseStr += ch;
            }
        }
        System.out.println(upperCaseStr);
        System.out.println(lowerCaseStr);
    }
}
