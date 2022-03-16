package LiJieShiTi.MoFangXuanZhuan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//试题 历届真题 魔方旋转问题【历届真题】【决赛】【高职组
		String[][][] mofang = {
				{{"绿橙白","蓝橙白"},{"绿红白","蓝红白"}},
				{{"绿橙黄","蓝橙黄"},{"绿红黄","蓝红黄"}}
		};
		Scanner sc = new Scanner(System.in);
		String s =sc.next();
		char[] cs = s.toCharArray();
		for(char c:cs){
			switch (c){
			case 'x':
				x(mofang);
				break;
			case 'y':
				y(mofang);
				break;
			case 'z':
				z(mofang);
				break;
			}
			
		}

		for (char c:mofang[0][1][0].toCharArray()){
			System.out.println(c);
		}
	}
	
	private static void x(String[][][] mofang){
		String[] sc=new String[4]; 
		sc[0] =mofang[1][0][0];
		sc[1] =mofang[0][0][0];
		sc[2] =mofang[0][1][0];
		sc[3] =mofang[1][1][0];
		for(int i=0;i<4;i++){
			char[] c =sc[i].toCharArray();
			char temp =c[1];
			c[1] =c[2];
			c[2] =temp;
			sc[i]=new String(c);
		}
		mofang[0][0][0] =sc[0];
		mofang[0][1][0] =sc[1];
		mofang[1][1][0] =sc[2];
		mofang[1][0][0] =sc[3];
	}
	private static void y(String[][][] mofang){
		String[] sc=new String[4]; 
		sc[0] =mofang[1][1][0];
		sc[1] =mofang[0][1][0];
		sc[2] =mofang[0][1][1];
		sc[3] =mofang[1][1][1];
		for(int i=0;i<4;i++){
			char[] c =sc[i].toCharArray();
			char temp =c[0];
			c[0] =c[2];
			c[2] =temp;
			sc[i]=new String(c);
		}
		mofang[0][1][0] =sc[0];
		mofang[0][1][1] =sc[1];
		mofang[1][1][1] =sc[2];
		mofang[1][1][0] =sc[3];
	}
	private static void z(String[][][] mofang){
		String[] sc=new String[4];
		sc[0] =mofang[0][1][0];
		sc[1] =mofang[0][0][0];
		sc[2] =mofang[0][0][1];
		sc[3] =mofang[0][1][1];
		for(int i=0;i<4;i++){
			char[] c =sc[i].toCharArray();
			char temp =c[1];
			c[1] =c[0];
			c[0] =temp;
			sc[i]=new String(c);
		}
		mofang[0][0][0] =sc[0];
		mofang[0][0][1] =sc[1];
		mofang[0][1][1] =sc[2];
		mofang[0][1][0] =sc[3];
	}

}
