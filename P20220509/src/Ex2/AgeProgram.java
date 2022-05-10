package Ex2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AgeProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
//		SimpleDateFormat mdf = new SimpleDateFormat("MMDD");
		
		String a = sdf.format(date);
		int m = Integer.parseInt(a);
		
		
		System.out.println("#나이 결과");
		System.out.println("입력한 생년월일:");
		String hb1 = sc.nextLine();		
		String hb2 = hb1.substring(0,2);
		String hb3 = hb1.substring(2);
		
		int yy = Integer.parseInt(hb2);
		int dd = Integer.parseInt(hb3);
		
		if(dd <= m & yy > 20) {
			System.out.println("나이:" + (121 - yy));
		} else if(dd >= m & yy <= 20 ) {
			System.out.println("나이:" + (21 - yy));
		} else if(dd < m & yy > 20) {
			System.out.println("나이:" + (122-yy));
		} else if(dd < m & yy < 20){
			System.out.println("나이:" + (22-yy));
		}
		
	}
}
