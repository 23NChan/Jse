import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Index {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] login = login();
        welcome(login[0]);
        while (true) {
            fuction_select(br);
        }

    }

    private static void welcome(String name) {
        System.out.println("************************************");
        System.out.println();
        System.out.println("        **学生成绩管理系统**          ");
        System.out.println("        *倾情奉献，欢迎使用*          ");
        System.out.println("        *欢迎" + name);
        System.out.println("************************************");
    }

    private static String[] login() {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("请输入用户名：");
            String name = br.readLine();
            System.out.print("请输入密码：");
            String password = br.readLine();
            return new String[]{name, password};
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new String[]{"-1"};
    }

    private static void fuction_select(BufferedReader br) {
        try {
            System.out.println("| 1.添加学生记录	2.修改学生记录");
            System.out.println("| 3.查找学生记录	4.删除学生记录");
            System.out.println("| 5.学生记录排序	6.显示所有学生记录");
            System.out.println("| 7.保存文件		8.退出系统");
            System.out.println("请选择0~7:");
            String select = br.readLine();
            switch (select) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "0":
                    finish();
                    break;
                default:
                    System.out.println("选项超出范围");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void finish() {
        Thread.currentThread().stop();
    }
}
