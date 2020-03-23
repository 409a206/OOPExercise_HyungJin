package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {
	
	private static Member[] m = new Member[10];
	private static int ctn;
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {}

	
	public void insertMember() {
		System.out.print("아이디 입력 : ");
		String userId = sc.next();
		System.out.print("패스워드 입력 : ");
		String userPwd = sc.next();
		System.out.print("이름 입력 : ");
		String userName = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("성별 입력 : ");
		char gender = sc.next().charAt(0);
		System.out.print("이메일 입력 : ");
		String email = sc.next();
		Member newMember = new Member(userId, userPwd, userName, age, gender, email);
		m[ctn] = newMember;
		ctn++;
		System.out.println("입력이 완료되었습니다. 메인메뉴로 돌아갑니다.");
		return;
		
	}

	public void printAllMember() {
		for(int i = 0; i < ctn; i++) {
			System.out.println(m[i].getUserId() + ", " + m[i].getUserPwd() + ", " + m[i].getUserName() + ", " + m[i].getAge() + ", " 
		+ m[i].getGender() + m[i].getEmail() );
		}
		
	}

	public void searchId() {
		System.out.print("검색할 아이디를 입력하시오 : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				printOne(m[i]);
				return;
			}
		}
		System.out.println("검색한 회원 정보가 존재하지 않습니다.");
		
	}

	public void searchName() {
		System.out.print("검색할 이름을 입력하시오 : ");
		String userName = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserName().equals(userName)) {
				printOne(m[i]);
				return;
			}
		}
		System.out.println("검색한 회원 정보가 존재하지 않습니다.");
		
	}

	public void searchEmail() {
		System.out.print("검색할 이메일을 입력하시오 : ");
		String email = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getEmail().equals(email)) {
				printOne(m[i]);
				return;
			}
		}
		System.out.println("검색한 회원 정보가 존재하지 않습니다.");
		
	}

	public void updatePwd() {
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				System.out.print("새 비밀번호를 입력하세요 : ");
				String userPwd = sc.next();
				m[i].setUserPwd(userPwd);
				System.out.println("패스워드 수정이 완료되었습니다.");
				return;
			}
		}
		System.out.println("수정할 회원이 존재하지 않습니다.");
		
	}

	public void updateName() {
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				System.out.print("새 이름을 입력하세요 : ");
				String userName = sc.next();
				m[i].setUserName(userName);
				System.out.println("이름 수정이 완료되었습니다.");
				return;
			}
		}
		System.out.println("수정할 회원이 존재하지 않습니다.");
		
		
	}

	public void updateEmail() {
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				System.out.print("새 이름을 입력하세요 : ");
				String email = sc.next();
				m[i].setEmail(email);
				System.out.println("이메일 수정이 완료되었습니다.");
				return;
			}
		}
		System.out.println("수정할 회원이 존재하지 않습니다.");
		
	}

	public void deleteOne() {
		System.out.print("탈퇴할 회원의 아이디를 입력하세요 : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				
				for(;i < ctn-1; i++) {
					m[i] = m[i+1];
				}
				ctn--;
				System.out.println("회원이 성공적으로 삭제되었습니다.");
				return;
				}
			}
		System.out.println("삭제할 회원 정보가 존재하지 않습니다.");
	}

	public void deleteAll() {
		for(int i = 0; i < ctn; i++) {
			m[i].setAge(0);
			m[i].setEmail(null);
			m[i].setGender(' ');
			m[i].setUserId(null);
			m[i].setUserPwd(null);
			m[i].setUserName(null);	
		}
		ctn = 0;
	}
	
	public void printOne(Member m) {
		System.out.println(m.getUserId() + ", " + m.getUserPwd() + ", " + m.getUserName() + ", " + m.getAge() + ", " + m.getGender()
		+ ", " + m.getEmail());
	}
	
	

}
