package JiChu.HuiWenShu;

public class Main {
    public static void main(String[] args) {
        for (int i = 1001; i <= 9999; i++){
            char[] chars = String.valueOf(i).toCharArray();
            if ((chars[0]==chars[3])&&(chars[1]==chars[2])) {
                System.out.println(i);
            }
        }
    }
}
