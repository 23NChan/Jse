package stuscore;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //欢迎界面
        System.out.println("*******************************");
        System.out.println("    **学生成绩管理系统**   ");
        System.out.println("    **倾情奉献 欢迎使用**");
        System.out.println("    **用户名：自己名 密码：自己学号");
        System.out.println("*******************************");
        //登录
        for (int i=0;i<3;i++) {
            String name;
            String password;
            System.out.println("请输入用户名：");
            name = sc.next();
            System.out.println("请输入密码：");
            password = sc.next();
            if (name.equals("吴伟") && password.equals("44")) {
                //登录成功，显示功能
                fuction_select(sc);
                i=3;
            } else {
                System.out.println("登陆失败！还剩"+(2-i)+"次机会");
            }
        }

        System.out.println("欢迎使用本系统");
        System.out.println("本系统由软件4班完成");
        System.out.println("制作人：吴伟");
        System.out.println("学号: 21110210844");
    }

    private static void fuction_select(Scanner sc) {
        boolean w = true;
        while (w) {
            System.out.println("| 1.添加学生记录	2.修改学生记录");
            System.out.println("| 3.查找学生记录	4.删除学生记录");
            System.out.println("| 5.学生记录排序	6.显示所有学生记录");
            System.out.println("| 7.保存文件		8.退出系统");
            System.out.println("请选择0~7:");
            int select = sc.nextInt();
            switch (select) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    w =false;
                    break;
                default:
                    System.out.println("输入错误！请输入0-7的整数！");
            }
        }
    }
}
