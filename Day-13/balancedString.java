package Day13;

public class balancedString {
    public static void main(String[] args) {
        String str = "1234";
        System.out.println(isBalanced(str));
    }
    public static boolean isBalanced(String str) {
        int oddCount = 0;
        int evenCount = 0;
        String [] arr = str.split("");
        for(int i=0;i<str.length();i++){
            Integer dig = Integer.valueOf(arr[i]);
            if(dig % 2 ==0){
                evenCount += i;
            }
            else{
                oddCount += i;
            }
        }
        if(oddCount == evenCount){
            return true;
        }
        else{
            return false;
        }
    }
}
