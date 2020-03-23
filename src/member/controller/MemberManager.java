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
		Member newMember = new Member(userId, userPwd, userName, age, gender, email);
		m[ctn] = newMember;
		ctn++;
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���θ޴��� ���ư��ϴ�.");
		return;
		
	}

	public void printAllMember() {
		
		
	}

	public void searchId() {
		System.out.print("�˻��� ���̵� �Է��Ͻÿ� : ");
		String userId = sc.next();
		
		for(int i = 0; i < m.length; i++) {
			if(m[i].getUserId().equals(userId)) {
				System.out.println(m[i]);
				return;
			}
		}
		System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
		
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
