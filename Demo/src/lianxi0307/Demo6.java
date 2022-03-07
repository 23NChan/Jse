package lianxi0307;

public class Demo6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<4;i++){
            int a =(int) (Math.random()*10);
            sb.append(a);
        }
        System.out.println(sb);
    }

}
