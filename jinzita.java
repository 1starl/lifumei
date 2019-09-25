package 练习;
/**
*@program:输出金字塔
*@Description:输出*字符形金字塔，共5行。
*@author:lfm
*@date:2019-9-18
*/

public class jinzita {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		for (int j = 1; j <= i; j++) {
			int times = (2*j)-1;
			int time=0;
			while(time!=(i-j))
			{
				System.out.print(" ");
				time++;
			}
			while (times != 0) {
				System.out.print("*");
				times--;
			}
			System.out.print("\n");
		}
	}


}
