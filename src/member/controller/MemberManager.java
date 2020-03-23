package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {
	
	private static Member[] m = new Member[10];
	private static int ctn;
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {}

	
	public void insertMember() {
		System.out.print("아이디 입력");
		String userId = sc.next();
		System.out.print("패스워드 입력");
		String userPwd = sc.next();
		System.out.print("이름 입력");
		String userName = sc.next();
		System.out.print("나이 입력");
		int age = sc.nextInt();
		System.out.print("성별 입력");
		char gender = sc.next().charAt(0);
		System.out.print("이메일 입력");
		String email = sc.next();
		Member newMember = new Member(userId, userPwd, userName, age, gender, email);
		m[ctn] = newMember;
		ctn++;
		System.out.println("입력이 완료되었습니다. 메인메뉴로 돌아갑니다.");
		return;
		
	}

	public void printAllMember() {
		
		
	}

	public void searchId() {
		System.out.print("검색할 아이디를 입력하시오 : ");
		String userId = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId().equals(userId)) {
				System.out.println(m[i]);
				return;
			}
		}
		System.out.println("검색한 회원 정보가 존재하지 않습니다.");
		
	}

	public void searchName() {
		// TODO Auto-generated method stub
		
	}

	public void searchEmail() {
		// TODO Auto-generated method stub
		
	}

	public void updatePwd() {
		// TODO Auto-generated method stub
		
	}

	public void updateName() {
		// TODO Auto-generated method stub
		
	}

	public void updateEmail() {
		// TODO Auto-generated method stub
		
	}

	public void deleteOne() {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}
