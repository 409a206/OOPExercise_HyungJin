package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {
	
	private static Member[] m = new Member[10];
	private static int ctn;
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {}

	
	public void insertMember() {
		System.out.print("���̵� �Է�");
		String userId = sc.next();
		System.out.print("�н����� �Է�");
		String userPwd = sc.next();
		System.out.print("�̸� �Է�");
		String userName = sc.next();
		System.out.print("���� �Է�");
		int age = sc.nextInt();
		System.out.print("���� �Է�");
		char gender = sc.next().charAt(0);
		System.out.print("�̸��� �Է�");
		String email = sc.next();
		int i = 0;
		Member newMember = new Member(userId, userPwd, userName, age, gender, email);
		m[i] = newMember;
		i++;
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���θ޴��� ���ư��ϴ�.");
		return;
		
	}

	public void printAllMember() {
		// TODO Auto-generated method stub
		
	}

	public void searchId() {
		// TODO Auto-generated method stub
		
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
