package javadb200106;

import java.sql.*;
import java.util.*;

import javadb191231.Bank;

public class Nailsql {


	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Nail nail =  new Nail();
	
	public void dbConnection() {
		con = JdbcConnection.makeConnection();
	}
	
	Scanner sc = new Scanner(System.in);
	
	// 고객 등록 메소드
	public void customer() {
		String sql = "INSERT INTO NAIL VALUES(NAIL_seq.NextVal,?,TO_DATE(?,'YYYY/MM/DD'),?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			System.out.print("이름 : ");
			pstmt.setString(1, sc.next());
			System.out.print("생일(YYYYMMDD) : ");
			pstmt.setString(2, sc.next());
			System.out.print("전화번호 : ");
			pstmt.setString(3, sc.next());
			System.out.print("정액권 : ");
			pstmt.setString(4, sc.next());
			pstmt.executeUpdate();
			System.out.println("고객등록 완료!!");
		} catch (SQLException e) {
			System.out.println("고객등록 실패!!");
		}
		
	}
	
	// 예약 메소드
	public void reservation() {
		String sql = "INSERT INTO RESERVATION VALUES(?,?,?,TO_CHAR(?, 'YYYY/MM/DD HH24:MI:SS'),?,?)";
		
		try {
			pstmt = con.prepareStatement(sql);
			
			System.out.print("이름 확인 : ");
			String name = sc.next();
			pstmt.setString(2, name);
			
			System.out.print("전화번호 확인 : ");
			String phone = sc.next();
			pstmt.setString(3, phone);
			
			int price = 0;
			if(name.equals(rs.getString("NAME")) && phone.equals(rs.getString("PHONE"))) {
				System.out.println("-----------------------------------------------------");
				System.out.println(" 1.손 케어 | 2.발 케어  | 3.손 젤  | 4.발 젤 | 5.포인트 아트 | 6.풀 아트");
				System.out.println("-----------------------------------------------------");
				System.out.print("선택 : ");
				int country = sc.nextInt();
					switch (country) {
					case 1 :
						price = 17000;
						pstmt.setString(5, "손 케어");
						break;
					case 2 : 
						price = 25000;
						pstmt.setString(5, "발 케어");
						break;
					case 3 : 
						price = 50000;
						pstmt.setString(5, "손 젤");
						break;
					case 4 : 
						price = 65000;
						pstmt.setString(5, "발 젤");
						break;
					case 5 : 
						price = 30000;
						pstmt.setString(5, "포인트 아트");
						break;
					case 6 :
						price = 50000;
						pstmt.setString(5, "풀 아트");
						break;
					}
			System.out.print("회원 여부 : ");
			pstmt.setString(1, sc.next());
			System.out.print("예약일시 : ");
			pstmt.setString(4, sc.next());
			System.out.print("지정 선생님 : ");
			pstmt.setString(6, sc.next());
			pstmt.executeUpdate();
			System.out.println("예약 완료!!");
		}
		} catch (SQLException e) {
			System.out.println("예약 실패!!");
		}
		
	}
	
	// 예약 변경 메소드
	
	
	// 예약 취소 메소드
	
	
	// 결제 메소드
	
	
	// 회원 조회 메소드
	
	
	// 예약 조회 메소드
	
	
	// 정액권 조회 메소드
	
	
	
	
	
	
	
	
}
