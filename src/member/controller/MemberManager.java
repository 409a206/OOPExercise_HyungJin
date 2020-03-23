package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {
	
	private static Member[] m = new Member[10];
	private static int ctn;
	private Scanner sc = new Scanner(System.in);
	
	public MemberManager() {}

	
	public void insertMember() {
		System.out.print("���̵� �Է� : ");
		String userId = sc.next();
		System.out.print("�н����� �Է� : ");
		String userPwd = sc.next();
		System.out.print("�̸� �Է� : ");
		String userName = sc.next();
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		System.out.print("���� �Է� : ");
		char gender = sc.next().charAt(0);
		System.out.print("�̸��� �Է� : ");
		String email = sc.next();
		Member newMember = new Member(userId, userPwd, userName, age, gender, email);
		m[ctn] = newMember;
		ctn++;
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���θ޴��� ���ư��ϴ�.");
		return;
		
	}

	public void printAllMember() {
		for(int i = 0; i < ctn; i++) {
			System.out.println(m[i].getUserId() + ", " + m[i].getUserPwd() + ", " + m[i].getUserName() + ", " + m[i].getAge() + ", " 
		+ m[i].getGender() + m[i].getEmail() );
		}
		
	}

	public void searchId() {
		System.out.print("�˻��� ���̵� �Է��Ͻÿ� : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				printOne(m[i]);
				return;
			}
		}
		System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
		
	}

	public void searchName() {
		System.out.print("�˻��� �̸��� �Է��Ͻÿ� : ");
		String userName = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserName().equals(userName)) {
				printOne(m[i]);
				return;
			}
		}
		System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
		
	}

	public void searchEmail() {
		System.out.print("�˻��� �̸����� �Է��Ͻÿ� : ");
		String email = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getEmail().equals(email)) {
				printOne(m[i]);
				return;
			}
		}
		System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
		
	}

	public void updatePwd() {
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				System.out.print("�� ��й�ȣ�� �Է��ϼ��� : ");
				String userPwd = sc.next();
				m[i].setUserPwd(userPwd);
				System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ�.");
				return;
			}
		}
		System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
		
	}

	public void updateName() {
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				System.out.print("�� �̸��� �Է��ϼ��� : ");
				String userName = sc.next();
				m[i].setUserName(userName);
				System.out.println("�̸� ������ �Ϸ�Ǿ����ϴ�.");
				return;
			}
		}
		System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
		
		
	}

	public void updateEmail() {
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				System.out.print("�� �̸��� �Է��ϼ��� : ");
				String email = sc.next();
				m[i].setEmail(email);
				System.out.println("�̸��� ������ �Ϸ�Ǿ����ϴ�.");
				return;
			}
		}
		System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
		
	}

	public void deleteOne() {
		System.out.print("Ż���� ȸ���� ���̵� �Է��ϼ��� : ");
		String userId = sc.next();
		
		for(int i = 0; i < ctn; i++) {
			if(m[i].getUserId().equals(userId)) {
				
				for(;i < ctn-1; i++) {
					m[i] = m[i+1];
				}
				ctn--;
				System.out.println("ȸ���� ���������� �����Ǿ����ϴ�.");
				return;
				}
			}
		System.out.println("������ ȸ�� ������ �������� �ʽ��ϴ�.");
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
