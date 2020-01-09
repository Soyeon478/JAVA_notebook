package javadb200106;

import java.sql.*;
import java.sql.Date;
import java.util.*;

public class NailMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Nailsql sql = new Nailsql();
		Nail nail = null;
		Nail reservation = null;
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------------------------------------------------------");
			System.out.println("0.DB접속 | 1.고객 등록 | 2.예약 | 3.예약 변경 | 4.예약 취소 | 5.결제 | 6.회원 조회 | 7.예약 조회 | 8.정액권 조회 | 9.종료");
			System.out.println("-------------------------------------------------------------------------------------------");
			System.out.print("선택> ");
			int selectNum = sc.nextInt();
			
			switch (selectNum) {
			case 0 :
				sql.dbConnection();
				break;
			case 1 :
				sql.customer();
				break;
			case 2 :
				sql.reservation();
				break;
			case 3 :
				
				break;
			case 4 :
				
				break;
			case 5 :
				
				break;
			case 6 :
				
				break;
			case 7 :
				
				break;
			case 8 :
				
				break;
			case 9 :
				run = false;
				System.out.println("종료 되었습니다.");
				break;
			}
		}
		
	}

}
