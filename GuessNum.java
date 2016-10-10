package com.migu.guessnum;

import java.util.Scanner;

public class GuessNum {
	
	int ans,n,t_start,t_end;
	String again;
	boolean play = true;
	Scanner console = new Scanner(System.in);
	/**
	 * 猜数字游戏
	 */
	public void game(){
		while(play){
			ans = (int) (Math.random()*100);
			System.out.println("------欢迎进入猜数字游戏------");
			t_start = (int) (System.currentTimeMillis()/1000);
			System.out.println("请输入一个0至100之间的整数");
			n = console.nextInt();
			while(n!=ans){
				if (n>ans) {
					System.out.println("您输入的数字大了，请重新输入一个更小的数：");
					n = console.nextInt();
					continue;
				}else{
					System.out.println("您输入的数字小了，请重新输入一个更大的数：");
					n = console.nextInt();
					continue;
				}
			}
			System.out.println("恭喜你猜对了！");
			t_end = (int) (System.currentTimeMillis()/1000);
			System.out.println("总共耗时"+(t_end-t_start)+"秒");
			System.out.println("是否继续：(y/n)");
			again = console.next();
			if (again.equals("n")) {
				play = false;
			}else continue;
		}
	}
	

	public static void main(String[] args) {
		GuessNum gn = new GuessNum();
		gn.game();

	}

}
